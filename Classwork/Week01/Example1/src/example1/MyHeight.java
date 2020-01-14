/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author tallenbrook
 */
public class MyHeight {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cm = 50;
        double inches = cm / 2.54;
        double feet = inches / 12;
        double inches2 = feet % 12;
        System.out.println("CM = " + cm + ", inches = " + inches + ", feet = " + feet + ", inches 2 = " + inches2);
        // TODO code application logic here
    }
    
}
