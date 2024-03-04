package es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.LineSub;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.PointMovablePoint.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    @Test
    void testToString() {
        Point begin = new Point(1,4);
        Point end = new Point(3,6);
        LineSub l1 = new LineSub(begin,end);
        assertEquals("Linea[begin = (1.0,4.0)end = (3.0,6.0)]", l1.toString());
    }

    @Test
    void getBegin() {
        LineSub l1 = new LineSub(1,4,3,6);
        Point puntoInicial = l1.getBegin();
        assertEquals(1, puntoInicial.getX());
        assertEquals(4, puntoInicial.getY());
    }

    @Test
    void getEnd() {
        LineSub l1 = new LineSub(1,4,3,6);
        Point puntoFinal = l1.getEnd();
        assertEquals(3, puntoFinal.getX());
        assertEquals(6,puntoFinal.getY());
    }

    @Test
    void setBegin() {
        LineSub l1 = new LineSub(1,2,3,6);
        l1.setBegin(2,4);
        Point puntoInicial = l1.getBegin();
        assertEquals(2,puntoInicial.getX());
        assertEquals(4,puntoInicial.getY());
    }

    @Test
    void setEnd() {
        LineSub l1 = new LineSub(1,2,3,6);
        l1.setEnd(2,4);
        Point puntoFinal = l1.getEnd();
        assertEquals(2,puntoFinal.getX());
        assertEquals(4,puntoFinal.getY());
    }

    @Test
    void getBeginX() {
        LineSub l1 = new LineSub(1,2,3,6);
        assertEquals(1,l1.getBeginX());
    }

    @Test
    void getEndX() {
        LineSub l1 = new LineSub(1,2,3,6);
        assertEquals(3,l1.getEndX());
    }

    @Test
    void getBeginY() {
        LineSub l1 = new LineSub(1,2,3,6);
        assertEquals(2,l1.getBeginY());

    }

    @Test
    void getEndY() {
        LineSub l1 = new LineSub(1,2,3,6);
        assertEquals(6,l1.getEndY());

    }

    @Test
    void setBeginX() {
        LineSub l1 = new LineSub(1,2,3,6);
        l1.setBeginX(2);
        assertEquals(2,l1.getBeginX());

    }

    @Test
    void setBeginY() {
        LineSub l1 = new LineSub(1,2,3,6);
        l1.setBeginY(3);
        assertEquals(3,l1.getBeginY());
    }

    @Test
    void setBeginXY() {
        LineSub l1 = new LineSub(1,2,3,6);
        l1.setBeginXY(6,7);
        assertEquals(6,l1.getBeginX());
        assertEquals(7,l1.getBeginY());
    }

    @Test
    void setEndX() {
        LineSub l1 = new LineSub(1,2,3,6);
        l1.setEndX(2);
        assertEquals(2,l1.getEndX());
    }

    @Test
    void setEndY() {
        LineSub l1 = new LineSub(1,2,3,6);
        l1.setEndY(3);
        assertEquals(3,l1.getEndY());
    }

    @Test
    void setEndXY() {
        LineSub l1 = new LineSub(1,2,3,6);
        l1.setEndXY(4,3);
        assertEquals(4,l1.getEndX());
        assertEquals(3,l1.getEndY());
    }

    @Test
    void getLength() {
        LineSub l1 = new LineSub(1,2,3,6);
        int xDiff=2;
        int yDiff=4;
        int length = (int) Math.sqrt(xDiff*xDiff+yDiff*yDiff);
        assertEquals(length,l1.getLength());
    }

    @Test
    void getGradient() {
        LineSub l1 = new LineSub(1,2,3,6);
        double xDiff=2;
        double yDiff=4;
        double gradient = Math.atan2(yDiff,xDiff);
        assertEquals(gradient,l1.getGradient());
    }
}