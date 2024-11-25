package org.example;

import java.awt.*;

public class Sphere implements Shape3DInterface{
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    @Override
    public double volume() {
        return 4/3*Math.PI*radius*radius*radius;
    }
}
