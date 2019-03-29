package com.structural.abstract_factory;

public class MedievalFactory implements GameUnitFactory {



    @Override
    public LandUnit createLandUnit(int capacity, int firepower) {
        return new Swordsmen(capacity,firepower);
    }

    @Override
    public NavalUnit createNavalUnit(int capacity, int firepower,int size) {
        return new Galleon(capacity,firepower,size);
    }
}
