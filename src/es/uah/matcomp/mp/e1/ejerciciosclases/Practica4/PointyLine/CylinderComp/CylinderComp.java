package es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.CylinderComp;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.CircleyCylinder.CircleB;

//Un cilindro está compuesto de un círculo base y una altura
public class CylinderComp {
    private CircleB base;
    private double height;
    public CylinderComp(){
        base = new CircleB();
        height = 1.0;
    }
    public CylinderComp(CircleB base,double height){
        this.base = base;
        this.height = height;
    }

    public CircleB getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(CircleB base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "CylinderComp[" + "base=" + base + ", height=" + height + "]";
    }
}
