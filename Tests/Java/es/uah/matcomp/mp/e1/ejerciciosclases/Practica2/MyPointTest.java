package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint p1 = new MyPoint(3,4);
        assertEquals(3,p1.getX());
    }

    @Test
    void getY() {
        MyPoint p1 = new MyPoint(3,4);
        assertEquals(4,p1.getY());
    }

    @Test
    void setY() {
        int nuevoY = 2;
        MyPoint p2 = new MyPoint(1,3);
        p2.setY(nuevoY);
        assertEquals(2,p2.getY());
    }

    @Test
    void setX() {
        int nuevoX = 5;
        MyPoint p2 = new MyPoint(1,3);
        p2.setX(nuevoX);
        assertEquals(5,p2.getX());
    }

    @Test
    void getXY() {
        MyPoint p3 = new MyPoint(3,2);
        int [] esperado = new int[2];
        esperado[0] = 3;
        esperado[1] = 2;
        int [] actual = p3.getXY();
        assertArrayEquals(esperado,actual);
    }

    @Test
    void setXY() {
        int nuevoX = 4;
        int nuevoY = 7;
        MyPoint p4 = new MyPoint(1,2);
        p4.setXY(nuevoX,nuevoY);
        int [] esperado = new int[] {4,7};
        int [] actual = p4.getXY();

        assertArrayEquals(esperado,actual);
    }

    @Test
    void testToString() {
        MyPoint p5 = new MyPoint(2,3);
        String esperado = "(2,3)";
        String actual = p5.toString();

        assertEquals(esperado,actual);
    }

    @Test
    void distance() { //One point and another's coordenates
        int x1 = 3;
        int y1 = 4;

        MyPoint p1 = new MyPoint(x1,y1);

        assertEquals(5,p1.distance(6,8));
    }

    @Test
    void testDistance() { //One point to another
        int x1 = 3;
        int y1 = 4;
        int x2 = 6;
        int y2 = 8;
        MyPoint p1 = new MyPoint(x1,y1);
        MyPoint p2 = new MyPoint(x2,y2);
        assertEquals(5,p1.distance(p2));
    }

    @Test
    void testDistance1() { //One point to 0,0
        MyPoint p1 = new MyPoint(3,4);
        assertEquals(5,p1.distance());
    }
}