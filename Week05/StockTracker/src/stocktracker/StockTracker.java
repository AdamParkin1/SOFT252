/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import java.util.ArrayList;
import stocktracker.stockdatamodel.PhysicalStockItem;
import stocktracker.stockdatamodel.ServiceStockItem;
import stocktracker.stockdatamodel.StockItem;
import stocktracker.stockdatamodel.StockType;
import stocktracker.stockdatamodel.AnObserver;
import utilities.IObserver;

/**
 *
 * @author rtucker and sthill
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StockItem objTestItem1 = new PhysicalStockItem("Starcraft Manual");
        StockItem objTestItem2 = new PhysicalStockItem("Halo 3", 100);
        StockItem objTestItem3 = new ServiceStockItem("Delivery");

        //Practical part 1: test item types
        if(objTestItem1.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 1 is a PHYSICAL stock item");
        }else{
            System.out.println("Item 1 is a SERVICE stock item");
        }
        //Item 2
        if(objTestItem2.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 2 is a PHYSICAL stock item");
        }else{
            System.out.println("Item 2 is a SERVICE stock item");
        }
        //Item 3
        if(objTestItem3.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 3 is a PHYSICAL stock item");
        }else{
            System.out.println("Item 3 is a SERVICE stock item");
        }
        
        //Practical part 2: test observer pattern        
        System.out.println("Creating Stock Items!");
        StockItem objPhysical = new PhysicalStockItem("Halo 3", 100);
        StockItem objService = new ServiceStockItem("Delivery");
        System.out.println("Stock Items created!");
        System.out.println("Creating an observer and registering with stock items.");
        IObserver observer = new AnObserver();
        objPhysical.registerObserver(observer);
        objService.registerObserver(observer);
        System.out.println("Observer created and registered with stock items.");
        System.out.println("Changing physical stock items quantity in stock...");
        objPhysical.setQuantityInStock(99);
        System.out.println("Setting delivery service stock items selling price...");
        objService.setSellingPrice(5.00);

    }
}
