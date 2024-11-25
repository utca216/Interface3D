package org.example;

import java.awt.*;

public class Cube implements Shape3DInterface{
    double Storona;

    public Cube(double storona) {
        Storona = storona;
    }

    @Override
    public double surfaceArea() {
        return Storona * Storona * 6;
    }

    @Override
    public double volume() {
        return Storona * Storona*Storona;
    }
}
