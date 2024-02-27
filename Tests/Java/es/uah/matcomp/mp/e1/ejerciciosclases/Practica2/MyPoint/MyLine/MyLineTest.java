package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyLine;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyLine l1 = new MyLine(1,2,3,4);
        MyPoint esperado = new MyPoint(1,2);
        assertEquals(esperado.getX(),l1.getBegin().getX());
        assertEquals(esperado.getY(),l1.getBegin().getY());
    }

    @Test
    void getEnd() {
        MyLine l1 = new MyLine(1,2,3,4);
        MyPoint esperado = new MyPoint(3,4);
        assertEquals(esperado.getX(),l1.getEnd().getX());
        assertEquals(esperado.getY(),l1.getEnd().getY());
    }

    @Test
    void setBegin() {
        MyLine l1 = new MyLine(5,4,3,4);
        MyPoint p1 = new MyPoint(1,2);
        l1.setBegin(p1);
        MyPoint esperado = new MyPoint(1,2);
        assertEquals(esperado.getX(),l1.getBegin().getX());
        assertEquals(esperado.getY(),l1.getBegin().getY());
    }

    @Test
    void setEnd() {
        MyLine l1 = new MyLine(1,2,3,4);
        MyPoint p1 = new MyPoint(5,6);
        l1.setEnd(p1);
        MyPoint esperado = new MyPoint(5,6);
        assertEquals(esperado.getX(),l1.getEnd().getX());
        assertEquals(esperado.getY(),l1.getEnd().getY());
    }

    @Test
    void getBeginX() {
        MyLine l1 = new MyLine(1,2,3,4);

        assertEquals(1,l1.getBeginX());
    }

    @Test
    void getBeginY() {
        MyLine l1 = new MyLine(1,2,3,4);

        assertEquals(2, l1.getBeginY());
    }

    @Test
    void setBeginX() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setBeginX(5);
        assertEquals(5, l1.getBeginX());
    }

    @Test
    void setBeginY() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setBeginY(9);
        assertEquals(9, l1.getBeginY());
    }

    @Test
    void getEndY() {
        MyLine l1 = new MyLine(1,2,3,4);

        assertEquals(4, l1.getEndY());
    }

    @Test
    void getEndX() {
        MyLine l1 = new MyLine(1,2,3,4);

        assertEquals(3, l1.getEndX());

    }

    @Test
    void setEndX() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setEndX(5);
        assertEquals(5, l1.getEndX());
    }

    @Test
    void setEndY() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setEndY(5);
        assertEquals(5, l1.getEndY());
    }

    @Test
    void getBeginXY() {
        MyLine l1 = new MyLine(1,2,3,4);
        int[] esperado = new int[] {1,2};
        assertArrayEquals(esperado, l1.getBeginXY());
    }

    @Test
    void setBeginXY() {
        MyLine l1 = new MyLine(1,2,3,4);
        int x = 3;
        int y = 6;
        l1.setBeginXY(x,y);
        int[] esperado = new int[] {3,6};

        assertArrayEquals(esperado, l1.getBeginXY());
    }

    @Test
    void getEndXY() {
        MyLine l1 = new MyLine(1,2,3,4);
        int [] esperado = new int[] {3,4};
        assertArrayEquals(esperado, l1.getEndXY());
    }

    @Test
    void setEndXY() {
        MyLine l1 = new MyLine(1,2,3,4);
        int x = 3;
        int y = 6;
        l1.setEndXY(x,y);
        int[] esperado = new int[] {3,6};

        assertArrayEquals(esperado, l1.getEndXY());
    }

    @Test
    void getLength() {
        MyLine l1 = new MyLine(3,4,6,8);

        double length = l1.getLength();
        assertEquals(5,length);
    }

    @Test
    void getGradient() {

    }

    @Test
    void testToString() {
        MyLine l1 = new MyLine(1,2,3,4);

        assertEquals("MyLine[begin=(1,2), end=(3,4)]", l1.toString());
    }
}