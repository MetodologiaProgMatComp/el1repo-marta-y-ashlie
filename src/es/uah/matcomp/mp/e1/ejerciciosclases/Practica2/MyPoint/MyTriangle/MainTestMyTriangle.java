package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyTriangle;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyPoint;

public class MainTestMyTriangle {
    public static void main(String[] args) {
        // Test MyTriangle constructor with int arguments
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 3, 4);
        System.out.println("triangle1: " + triangle1.toString());
        System.out.println("triangle1 perimeter: " + triangle1.getPerimeter());
        System.out.println("triangle1 type: " + triangle1.getType());

        // Test MyTriangle constructor with MyPoint arguments
        MyPoint v21 = new MyPoint(1, 1);
        MyPoint v22 = new MyPoint(4, 1);
        MyPoint v23 = new MyPoint(4, 3);
        MyTriangle triangle2 = new MyTriangle(v21, v22, v23);
        System.out.println("triangle2: " + triangle2.toString());
        System.out.println("triangle2 perimeter: " + triangle2.getPerimeter());
        System.out.println("triangle2 type: " + triangle2.getType());
    }
}
