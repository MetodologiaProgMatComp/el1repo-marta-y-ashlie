package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyCircle;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyPoint;

public class MainTestMyCircle {
    public static void main(String[] args) {
        // Create a new MyCircle object using the default constructor
        MyCircle circle1 = new MyCircle();
        System.out.println("circle1: " + circle1.toString());

        // Create a new MyCircle object using the constructor with x, y, and radius
        MyCircle circle2 = new MyCircle(5, 5, 3);
        System.out.println("circle2: " + circle2.toString());

        // Create a new MyCircle object using the constructor with MyPoint and radius
        MyPoint center3 = new MyPoint(10, 10);
        MyCircle circle3 = new MyCircle(center3, 2);
        System.out.println("circle3: " + circle3.toString());

        // Change the properties of the circles
        circle1.setCenter(new MyPoint(1, 2));
        circle1.setRadius(4);
        circle2.setCenterXY(7, 8);
        circle3.setRadius(1);

        System.out.println("circle1: " + circle1.toString());
        System.out.println("circle2: " + circle2.toString());
        System.out.println("circle3: " + circle3.toString());

        // Calculate the area and circumference of the circles
        System.out.println("circle1 area: " + circle1.getArea());
        System.out.println("circle1 circumference: " + circle1.getCircumference());
        System.out.println("circle2 area: " + circle2.getArea());
        System.out.println("circle2 circumference: " + circle2.getCircumference());
        System.out.println("circle3 area: " + circle3.getArea());
        System.out.println("circle3 circumference: " + circle3.getCircumference());

        // Calculate the distance between the circles
        System.out.println("Distance between circle1 and circle2: " + circle1.distance(circle2));
        System.out.println("Distance between circle1 and circle3: " + circle1.distance(circle3));
        System.out.println("Distance between circle2 and circle3: " + circle2.distance(circle3));
    }
}
