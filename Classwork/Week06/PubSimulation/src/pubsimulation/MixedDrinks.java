/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;

/**
 *
 * @author aparkin1
 */
public abstract class MixedDrinks implements iPubSim  {
    @Override
    
    public void serveDrink() {
       System.out.println("Add ice to glass");
       addSpirit();
       System.out.println("Add mixer to glass");
       addGarnish();
    }
    
    protected abstract void addSpirit();
    protected abstract void addGarnish();  
}
