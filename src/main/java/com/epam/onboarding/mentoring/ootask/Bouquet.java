package com.epam.onboarding.mentoring.ootask;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    private int cost = 0;
    private List<Flower> flowers = new ArrayList<>();

    public int getCost() {
        cost = 0;
        for (Flower flower : flowers) {
            cost = cost + flower.getCost();
        }
        return cost;
    }

    public void add(Flower flower, int count) {
        for (int counter = 0; counter < count; counter++)
            add(flower);
    }

    public void add(Flower flower) {
        flowers.add(flower);
    }
}
