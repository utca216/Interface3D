package org.example;

import java.awt.*;

public class Cylinder implements Shape3DInterface{
    double height;
    double radius;
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    @Override
    public double volume() {
        return Math.PI * radius * radius*height;
    }
    @Override
    public double surfaceArea() {
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
}
