package es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.Line;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.PointMovablePoint.Point;
import es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.Line.Line;

public class MainLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(3, 4);
        Point p2 = new Point(5, 6);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println("Establecemos el inicio como (4.0,3.0");
        l2.setBeginX(4);
        l2.setBeginY(3);
        System.out.println(l2);
        System.out.println("Ahora establecemos el final como (6.0,7.0)");
        l2.setEndXY(6,7);
        System.out.println(l2);
        System.out.println("Ahora hallamos la distancia entre un punto y otro");
        System.out.println(l2.getLength());
        System.out.println("Ahora hallamos la gradiente");
        System.out.println(l2.getGradient());
        System.out.println("La coordenada x del punto inical es:"+l2.getBeginX());
        System.out.println("La coordenada y del punto inical es:"+l2.getBeginY());
        System.out.println("La coordenada x del punto final es:"+l2.getEndX());
        System.out.println("La coordenada y del punto final es:"+l2.getEndY());
        System.out.println("El punto inicial es: "+ l2.getBegin());
        System.out.println("El punto final es: "+ l2.getEnd());
        System.out.println("Cambiamos el punto inicial");
        Point begin = new Point(4,8);
        l2.setBegin(begin);
        System.out.println("Cambiamos el punto final");
        Point punto2 = new Point(6,7);
        l2.setEnd(punto2);
        System.out.println("Nuevamente cambiamos los puntos");
        l2.setBeginXY(2,3);
        l2.setEndX(9);
        l2.setEndY(6);
        System.out.println(l2);

    }
}
