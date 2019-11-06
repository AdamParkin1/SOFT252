/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

import java.util.ArrayList;
import utilities.IObserver;
import utilities.ISubject;

/**
 * Super class from which specialised stock item classes will inherit
 *
 * @author rtucker
 */
public abstract class StockItem implements ISubject {

    protected String name = "UNKNOWN";
    protected Integer quantityInStock = 0;
    protected Double sellingPrice = 0.00;
    protected Double costPrice = 0.00;
    private ArrayList<IObserver> observers = null;

    public StockItem() {
    }

    public StockItem(String name) {
        this.name = name;
    }

    public StockItem(String name, Integer qty) {
        this.name = name;
        this.quantityInStock = qty;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        if (costPrice != null && costPrice >= 0) {
            this.costPrice = costPrice;
            notifyObservers();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
            notifyObservers();
        }
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        if (quantityInStock != null && quantityInStock >= 0) {
            this.quantityInStock = quantityInStock;
            notifyObservers();
        }
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if (sellingPrice != null && sellingPrice >= this.costPrice && sellingPrice >= 0) {
            this.sellingPrice = sellingPrice;
            notifyObservers();
        }
    }

    public Boolean isInStock() {
        Boolean inStock = false;
        if (this.quantityInStock > 0) {
            inStock = true;
        }
        return inStock;
    }

    public abstract StockType getItemType();

    @Override
    public Boolean registerObserver(IObserver o) {
        Boolean blnAdded = false;                   //Assume this method will fail
        //Validate that observer exists
        if (o != null) {
            //If observer list not initialised create it
            if (this.observers == null) {
                this.observers = new ArrayList<>();
            }
            //Add the observer to the list of registered observers if not already registered
            if(!this.observers.contains(o)){
                blnAdded = this.observers.add(o);
            }
        }
        //Return the result
        return blnAdded;
    }

    @Override
    public Boolean removeObserver(IObserver o) {
        Boolean blnRemoved = false;
        //Validate we have something to remove
        if (o != null) {
            if(this.observers != null && this.observers.size() > 0){
                blnRemoved = this.observers.remove(o);
            }
        }
        return blnRemoved;
    }

    @Override
    public void notifyObservers() {
        //Ensure we have a valid list of observers
        if (this.observers != null && this.observers.size() > 0) {
            //Start foreach loop
            for (IObserver currentObserver : this.observers) {
                //Call update on this observer
                currentObserver.update();
            }
        }
    }
}
