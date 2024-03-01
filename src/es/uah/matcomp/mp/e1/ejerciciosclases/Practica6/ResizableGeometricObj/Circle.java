package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.ResizableGeometricObj;

public class Circle implements GeometricObject{
    //Variable privada
    protected double radius;

    //Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    //Implement methods defined int the interfaz GeometricObject
    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
