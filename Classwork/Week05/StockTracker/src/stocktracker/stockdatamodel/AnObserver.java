/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

import utilities.IObserver;

/**
 * Test class - A simple observer
 * @author rtucker
 */
public class AnObserver implements IObserver {

    @Override
    public void update() {
        System.out.println("State Change was detected!!!");
    }
}
