package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea () {
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape[Color=" + super.getColor() + ",filled=" + super.isFilled() + "],radius=" + this.radius + "]";
    }

}
