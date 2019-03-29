package com.structural.abstract_factory;

public class Swordsmen implements LandUnit {

    private int capacity;
    private int firepower;

    public Swordsmen(int capacity, int firepower) {
        this.capacity=capacity;
        this.firepower=firepower;
    }

    @Override
    public LandUnit createLandUnit(int capacity, int firepower) {
        return new Swordsmen(capacity,firepower);
    }
}
