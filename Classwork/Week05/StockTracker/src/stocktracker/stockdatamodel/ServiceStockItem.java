/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

/**
 *
 * @author rtucker
 */
public class ServiceStockItem extends StockItem {
    
    public ServiceStockItem()
    {
        super();
    }
    
    public ServiceStockItem(String name)
    {
        super(name);
    }
    
    public ServiceStockItem(String name, Integer qty)
    {
        super(name, 0);
    }

    @Override
    public Boolean isInStock() {
        return true;
    }

    @Override
    public StockType getItemType() {
        return StockType.SERVICEITEM;
    }

    @Override
    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = 0;
    }
}
