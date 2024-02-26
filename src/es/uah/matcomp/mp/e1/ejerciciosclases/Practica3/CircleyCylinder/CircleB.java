package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.CircleyCylinder;

public class CircleB {
    double radius =1.0;
    String color = "red";

    public CircleB() {
    }

    public CircleB(double radius) {
        this.radius = radius;
    }

    public CircleB(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public String toString() {
        return "Circle[radius = " + radius + ", color = " + color + "]";
    }
}
