package com.structural.proxy;

import java.awt.geom.Point2D;

public class ImageProxy implements Image {

    private BitMapImage bitMapImage;
    private String name;
    private Point2D location;

    public ImageProxy(String name) {
        this.name = name;
    }


    @Override
    public void setLocation(Point2D point2D) {
        if (bitMapImage != null)
            bitMapImage.setLocation(point2D);
        else
            location = point2D;
    }

    @Override
    public Point2D getLocation() {
        if (bitMapImage != null)
            return bitMapImage.getLocation();
        else
            return location;
    }

    @Override
    public void render() {
        if (bitMapImage == null)
            bitMapImage = new BitMapImage(name);
            if (location != null)
                bitMapImage.setLocation(location);
        bitMapImage.render();

    }
}
