package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
    }
    public void addExtraCheese(){
        // your code goes here
        this.setBill("Extra Cheese Added: 0\n");
    }

    public void addExtraToppings(){
        // your code goes here
        this.setBill("Extra Toppings Added: 0\n");
    }
}
