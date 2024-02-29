package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.GeometricObject;

public class Circle implements GeometricObject{
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
}
