package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.Shape;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) { ////////////
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    //¿Override?
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override       //No es polimrofismo, solo herencia
    public void setWidth(double side) {}

    @Override       //No es polimorfismo, solo herencia
    public void setLength(double side) {}

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[Color=" + super.getColor() + ",filled=" + super.isFilled() + "],width=" + this.getSide() + ",length=" + this.getSide() + "]]";
    }
}
