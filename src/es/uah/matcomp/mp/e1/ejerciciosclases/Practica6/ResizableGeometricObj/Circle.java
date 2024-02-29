package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.ResizableGeometricObj;

public class Circle implements GeometricObject{
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
