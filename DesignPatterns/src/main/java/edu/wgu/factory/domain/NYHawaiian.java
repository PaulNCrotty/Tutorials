package edu.wgu.factory.domain;

public class NYCheese implements Pizza {

    @Override
    public void preparePizza() {
        System.out.println("Adding all sorts of yummy cheeses to the top of this bad boy.");
    }

    @Override
    public void bakePizza() {
        System.out.println("Baking at 415 for 10 minutes");
    }
}
