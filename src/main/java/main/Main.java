package main;

import pizza.CapriciosaPizza;
import pizza.HawaiPizza;
import pizza.Pizza;
import pizza.PizzaType;

public class Main {
    public static void main(String[] args) {
        CapriciosaPizza capriciosaPizza = new CapriciosaPizza();
        HawaiPizza hawaiPizza = new HawaiPizza();
       capriciosaPizza.showPizzaInfo();
       hawaiPizza.showPizzaInfo();

    }
    public Pizza create (PizzaType pizzaType){
        if (PizzaType.CAPRICIOSA.equals(pizzaType)){
            return new Pizza ();
        }else if (PizzaType.HAWAI.equals(pizzaType)){
            return new Pizza();
        }else if (PizzaType.MARGHERITA.equals(pizzaType)){
            return new Pizza();
        }else if (PizzaType.POLSKA.equals(pizzaType)){
            return new Pizza();
        }
        return null;
    }

}
