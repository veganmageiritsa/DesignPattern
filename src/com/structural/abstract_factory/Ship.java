package com.structural.abstract_factory;

public class Ship implements NavalUnit {

    private int capacity;
    private int firepower;
    private int size;

    public Ship(int capacity, int firepower, int size) {
        this.capacity = capacity;
        this.firepower = firepower;
        this.size = size;
    }

    @Override
    public NavalUnit createNavalUnit(int capacity, int firepower, int size) {
        return new Ship(capacity,firepower,size);
    }
}
