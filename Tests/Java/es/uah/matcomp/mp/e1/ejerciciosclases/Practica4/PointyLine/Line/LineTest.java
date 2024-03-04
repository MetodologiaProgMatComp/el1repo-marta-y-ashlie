package es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.Line;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.PointMovablePoint.Point;
import es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.LineSub.LineSub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testToString() {
        Point begin = new Point(1,4);
        Point end = new Point(3,6);
        Line l1 = new Line(begin,end);
        assertEquals("Linea[begin = (1.0,4.0) end = (3.0,6.0)]", l1.toString());
    }

    @Test
    void getBegin() {
        Line l1 = new Line(1,4,3,6);
        Point puntoInicial = l1.getBegin();
        assertEquals(1, puntoInicial.getX());
        assertEquals(4, puntoInicial.getY());
    }

    @Test
    void getEnd() {
        Line l1 = new Line(1,4,3,6);
        Point puntoFinal = l1.getEnd();
        assertEquals(3, puntoFinal.getX());
        assertEquals(6,puntoFinal.getY());
    }

    @Test
    void setBegin() {
        Line l1 = new Line(1,2,3,6);
        Point begin = new Point(2,4);
        l1.setBegin(begin);
        Point puntoInicial = l1.getBegin();
        assertEquals(2,puntoInicial.getX());
        assertEquals(4,puntoInicial.getY());
    }

    @Test
    void setEnd() {
        Line l1 = new Line(1,2,3,6);
        Point begin = new Point(2,4);
        l1.setEnd(begin);
        Point puntoFinal = l1.getEnd();
        assertEquals(2,puntoFinal.getX());
        assertEquals(4,puntoFinal.getY());
    }

    @Test
    void getBeginX() {
        Line l1 = new Line(1,2,3,6);
        assertEquals(1,l1.getBeginX());
    }

    @Test
    void getEndX() {
        Line l1 = new Line(1,2,3,6);
        assertEquals(3,l1.getEndX());
    }

    @Test
    void getBeginY() {
        Line l1 = new Line(1,2,3,6);
        assertEquals(2,l1.getBeginY());
    }

    @Test
    void getEndY() {
        Line l1 = new Line(1,2,3,6);
        assertEquals(6,l1.getEndY());
    }

    @Test
    void setBeginX() {
        Line l1 = new Line(1,2,3,6);
        l1.setBeginX(2);
        assertEquals(2,l1.getBeginX());
    }

    @Test
    void setBeginY() {
        Line l1 = new Line(1,2,3,6);
        l1.setBeginY(3);
        assertEquals(3,l1.getBeginY());
    }

    @Test
    void setEndX() {
        Line l1 = new Line(1,2,3,6);
        l1.setEndX(2);
        assertEquals(2,l1.getEndX());
    }

    @Test
    void setEndY() {
        Line l1 = new Line(1,2,3,6);
        l1.setEndY(3);
        assertEquals(3,l1.getEndY());
    }

    @Test
    void setBeginXY() {
        Line l1 = new Line(1,2,3,6);
        l1.setBeginXY(6,7);
        assertEquals(6,l1.getBeginX());
        assertEquals(7,l1.getBeginY());
    }

    @Test
    void setEndXY() {
        Line l1 = new Line(1,2,3,6);
        l1.setEndXY(4,3);
        assertEquals(4,l1.getEndX());
        assertEquals(3,l1.getEndY());
    }

    @Test
    void getLength() {
        Point begin = new Point(1,4);
        Point end = new Point(3,6);
        Line l1 = new Line(begin,end);
        int xDiff=2;
        int yDiff=2;
        int length = (int) Math.sqrt(xDiff*xDiff+yDiff*yDiff);
        assertEquals(length,l1.getLength());
    }

    @Test
    void getGradient() {
        Line l1 = new Line(1,2,3,6);
        double xDiff=2;
        double yDiff=4;
        double gradient = Math.atan2(yDiff,xDiff);
        assertEquals(gradient,l1.getGradient());
    }
}