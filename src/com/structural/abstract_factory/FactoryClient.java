package com.structural.abstract_factory;

public class FactoryClient {

private GameUnitFactory unitFactory;

    public FactoryClient(GameUnitFactory unitFactory) {
        this.unitFactory = unitFactory;
    }

    public GameUnitFactory getUnitFactory() {
        return unitFactory;
    }

    public void setUnitFactory(GameUnitFactory unitFactory) {
        this.unitFactory = unitFactory;
    }

    public static void main(String[] args) {
        FactoryClient factoryClient=new FactoryClient(new IndustrialFactory());
        LandUnit landUnit = factoryClient.getUnitFactory().createLandUnit(40, 60);
        System.out.println(landUnit.toString());


    }

}
