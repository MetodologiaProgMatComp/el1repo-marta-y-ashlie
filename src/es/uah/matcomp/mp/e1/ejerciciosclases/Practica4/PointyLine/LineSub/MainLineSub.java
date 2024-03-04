package es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.LineSub;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.PointMovablePoint.Point;
import es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.Line.Line;

public class MainLineSub {
    public static void main(String[] args) {
        LineSub ls1 = new LineSub(4,2,3,5);
        System.out.println(ls1);
        Point p1 = new Point(2, 4);
        Point p2 = new Point(4, 6);
        Line ls2 = new Line(p1, p2);
        System.out.println(ls2);
        Point begin3 = new Point(4,8);
        Point end3 = new Point(5,8);
        LineSub ls3 = new LineSub(begin3,end3);
        System.out.println(ls3);
        System.out.println("Hallamos la distancia entre un punto y otro");
        System.out.println(ls3.getLength());
        System.out.println("Hallamos la gradiente");
        System.out.println(ls3.getGradient());
        System.out.println("La coordenada x del punto inical es:"+ls3.getBeginX());
        System.out.println("La coordenada y del punto inical es:"+ls3.getBeginY());
        System.out.println("La coordenada x del punto final es:"+ls3.getEndX());
        System.out.println("La coordenada y del punto final es:"+ls3.getEndY());
        System.out.println("Nuevamente cambiamos los puntos");
        ls3.setBeginXY(2,3);
        ls3.setEndX(9);
        ls3.setEndY(6);
        System.out.println("El punto inicial es: "+ ls3.getBegin());
        System.out.println("El punto final es: "+ ls3.getEnd());
        System.out.println("Cambiamos el punto inicial");
        ls3.setBegin(2,4);
        System.out.println("Cambiamos el punto final");
        Point punto2 = new Point(6,7);
        ls3.setEnd(5,6);
        System.out.println(ls3);
        System.out.println("Creamos un nueva linea");
        LineSub ls4 = new LineSub(2,3,4,6);
        ls4.setBeginX(2);
        ls4.setBeginY(3);
        ls4.setEndXY(2,7);
        System.out.println(ls4);




    }
}
