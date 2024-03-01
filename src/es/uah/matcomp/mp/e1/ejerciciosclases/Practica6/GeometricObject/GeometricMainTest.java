package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.GeometricObject;

public class GeometricMainTest {

    public static void main(String[] args){
        GeometricObject g1 = new Circle(7);
        System.out.println("g1 area:" +g1.getArea());
        System.out.println("g1 perimetro:" + g1.getPerimeter());
        System.out.println(g1.toString());

        GeometricObject g2 = new Rectangle(2,3);
        System.out.println("g2 perimetro:" + g2.getPerimeter());
        System.out.println("g2 area:" + g2.getArea());
        System.out.println(g2.toString());

        Circle c1 = (Circle)g1;
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println(c1.toString());

        Rectangle r1 = (Rectangle)g2;
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.toString());
    }

}
