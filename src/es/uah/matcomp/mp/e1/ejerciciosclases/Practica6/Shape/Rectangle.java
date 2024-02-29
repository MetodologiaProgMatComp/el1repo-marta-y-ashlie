package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.Shape;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.Shape.Shape;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override       //Polimorfismo
    public double getArea() {
        return width * length;
    }
    @Override       //Polimorfismo
    public double getPerimeter() {
        double perimetro = (2 * width) + (2 * length);
        return perimetro;
    }
    @Override       //Polimorfismo
    public String toString() {
        return "Rectangle[Shape[Color=" + super.getColor() + ",filled=" + super.isFilled() + "],width=" + this.width + ",length=" + this.length + "]";
    }
}