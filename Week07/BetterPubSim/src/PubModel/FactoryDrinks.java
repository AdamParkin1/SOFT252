/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel;

import PubModel.Strategies.IDrinksStrategy;

/**
 *
 * @author aparkin1
 */
public abstract class FactoryDrinks {
    
    public static IDrinksStrategy selectDrink(String drinkType){
        IDrinksStrategy strategy;
        
        switch (drinkType.toLowerCase()) {
            case "pint":
                strategy = new PubModel.Strategies.TapStrategy();
                break;
            case "bottle":
                strategy = new PubModel.Strategies.BottleStrategy();
                break;
            case "tea":
                strategy = new PubModel.Strategies.TeaStrategy();
                break;
            case "coffee":
                strategy = new PubModel.Strategies.CoffeeStrategy();
                break;
            case "long drink":
                strategy = new PubModel.Strategies.LongDrinkStrategy();
                break;
            case "cocktail":
                strategy = new PubModel.Strategies.CocktailStrategy();
                break;
            default:
                strategy = new PubModel.Strategies.DefaultStrategy();
                break;
        }
        
        return strategy;
    }
}
