package edu.wgu.factory.domain;

public class ChicagoCheese implements Pizza {

    @Override
    public void preparePizza() {
        System.out.println("Adding all sorts of yummy cheeses to the top of this guy.");
    }

    @Override
    public void bakePizza() {
        System.out.println("Baking at 395 for 17 minutes");
    }

}
