package com.structural.proxy;

import java.awt.geom.Point2D;

public class BitMapImage implements Image {

    private Point2D location;
    private String name;


    public BitMapImage(String fileName) {
        System.out.println("Loaded from Disk "  + fileName);
        this.name=fileName;
    }

    @Override
    public void setLocation(Point2D point2D) {
        this.location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Render" + " " + this.name);
    }
}
