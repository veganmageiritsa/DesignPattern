package com.structural.abstract_factory;

public class Riflemen implements LandUnit {

    private int capacity;
    private  int firepower;

    public Riflemen(int capacity, int firepower) {
        this.capacity = capacity;
        this.firepower = firepower;
    }

    @Override
    public LandUnit createLandUnit(int capacity, int firepower) {
        return new Riflemen(capacity,firepower);
    }

    @Override
    public String toString() {
        return "Riflemen{" +
                "capacity=" + capacity +
                ", firepower=" + firepower +
                '}';
    }
}
