package com.epam.onboarding.mentoring.ootask;

public class Client {

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();

        bouquet.add(new Rose(), 2);
        bouquet.add(new Jasmine(), 5);
        bouquet.add(new Lily(), 10);
        bouquet.add(new Rose());

        int TotalCost = bouquet.getCost();

        System.out.println("Total Bouquet Cost is " + TotalCost);
    }
}
