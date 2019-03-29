package com.structural.abstract_factory;

public class Galleon implements NavalUnit {

    private int capacity;
    private int firepower;
    private int size;

    public Galleon(int capacity, int firepower, int size) {
        this.capacity = capacity;
        this.firepower = firepower;
        this.size = size;
    }

    @Override
    public NavalUnit createNavalUnit(int capacity, int firepower,int size) {
        return new Galleon(capacity,firepower,size);
    }
}
