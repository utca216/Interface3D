package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Shape3DInterface> shapes = new ArrayList<Shape3DInterface>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            switch (rand.nextInt(3)) {
                case 0:
                    shapes.add(new Cube(1+rand.nextDouble(10)));
                    break;
                case 1:
                    shapes.add(new Sphere(1+rand.nextDouble(10)));
                    break;
                case 2:
                    shapes.add(new Cylinder(1+rand.nextDouble(10),5+rand.nextDouble(15)));
                    break;
            }
        }
        for (Shape3DInterface shape : shapes) {
            if (shape instanceof Cube) {
                Cube cube = (Cube) shape;
                System.out.println("Name: Cube");
                System.out.println("volume: " + cube.volume());
                System.out.println("surface area: " + cube.surfaceArea());
                System.out.println("radius "+cube.Storona);
                System.out.println(" ");
            } else if (shape instanceof Sphere) {
                Sphere sphere = (Sphere) shape;
                System.out.println("Name: Sphere ");
                System.out.println("volume: " + sphere.volume());
                System.out.println("surface area: " + sphere.surfaceArea());
                System.out.println("radius "+sphere.radius);
                System.out.println(" ");
            } else if (shape instanceof Cylinder) {
                Cylinder cylinder = (Cylinder) shape;
                System.out.println("Name: Cylynder ");
                System.out.println("volume: " + cylinder.volume());
                System.out.println("surface area: " + cylinder.surfaceArea());
                System.out.println("radius "+cylinder.radius);
                System.out.println("height "+cylinder.height);
                System.out.println(" ");
            }
        }


    }
}