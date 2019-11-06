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
public abstract class HotDrinks implements iPubSim  {
    @Override
    
    public void serveDrink() {
       System.out.println("Boil water");
       brew();
       System.out.println("Pour result into cup");
       addThing();
    }
    
    protected abstract void brew();
    protected abstract void addThing();
}
