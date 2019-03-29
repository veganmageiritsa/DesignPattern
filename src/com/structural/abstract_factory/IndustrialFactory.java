package com.structural.abstract_factory;

public class IndustrialFactory implements GameUnitFactory {


    @Override
    public LandUnit createLandUnit(int capacity, int firepower) {
        return new Riflemen(capacity,firepower);
    }

    @Override
    public NavalUnit createNavalUnit(int capacity, int firepower,int size) {
        return new Ship(capacity,firepower,size);
    }
}
