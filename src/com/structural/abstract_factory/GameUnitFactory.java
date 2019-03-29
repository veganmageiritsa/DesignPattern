package com.structural.abstract_factory;

public interface GameUnitFactory {

      LandUnit createLandUnit(int capacity,int firepower);
      NavalUnit createNavalUnit(int capacity,int firepower, int size);
}
