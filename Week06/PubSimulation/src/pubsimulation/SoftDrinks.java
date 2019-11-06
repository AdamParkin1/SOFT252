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
public abstract class SoftDrinks implements iPubSim {
    @Override
    
    public void serveDrink() {
       pourDrink();
       System.out.println("Pour drink into glass");
    }
    
    protected abstract void pourDrink();
    
    
    
    
}
