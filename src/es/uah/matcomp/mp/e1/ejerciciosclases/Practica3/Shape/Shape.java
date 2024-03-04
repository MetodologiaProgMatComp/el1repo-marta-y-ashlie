package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "shape[color=" + this.color + ",filled=" + filled +"]";
    }
}