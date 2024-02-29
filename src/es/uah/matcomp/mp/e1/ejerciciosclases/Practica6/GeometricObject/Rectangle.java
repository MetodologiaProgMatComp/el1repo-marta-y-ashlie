package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.GeometricObject;

public class Rectangle implements GeometricObject{
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + this.width + ",length=" + this.length + "]";
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (width*2)+ (length*2);
    }
}
