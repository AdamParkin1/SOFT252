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
public class Tea extends HotDrinks {

    @Override
    protected void brew() {
        System.out.println("Steep tea in water");
    }

    @Override
    protected void addThing() {
        System.out.println("Add lemon");
    }
}
