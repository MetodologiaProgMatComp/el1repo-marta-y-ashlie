package es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.CylinderComp;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.CircleyCylinder.CircleB;

public class MainCylinderComp {
    public static void main(String[] args){
        CylinderComp c1= new CylinderComp();
        System.out.println(c1);
        System.out.println("La base del cilindro es: "+c1.getBase());
        System.out.println("La altura del cilindro es: "+c1.getHeight());
        System.out.println("Cambiamos su base y altura");
        CircleB circle1 = new CircleB(5,"rojo");
        c1.setBase(circle1);
        c1.setHeight(5);
        System.out.println(c1);
        CylinderComp c2=new CylinderComp(circle1,8);
    }
}
