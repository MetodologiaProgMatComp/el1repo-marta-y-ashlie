package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.PointMovablePoint;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Point2DyPoint3D.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void getX() {
        float x = 0.2f;
        float y = 2.1f;
        Point point =new Point(x,y);
        assertEquals(x,point.getX());

    }

    @Test
    void getY() {
        float x = 0.2f;
        float y = 2.1f;
        Point point =new Point (x,y);
        assertEquals(y,point.getY());
    }

    @Test
    void getXY() {
        float x = 0.2f;
        float y = 2.1f;
        Point point =new Point (x,y);
        float[] esperado = {0.2f,2.1f};
        assertArrayEquals(esperado,point.getXY());
    }

    @Test
    void setX() {
        float x = 0.2f;
        float y = 2.1f;
        Point point =new Point (x,y);
        float newX =0.8f;
        point.setX(newX);
        assertEquals(newX,point.getX());
    }

    @Test
    void setY() {
        float x = 0.2f;
        float y = 2.1f;
        Point point =new Point (x,y);
        float newY =0.5f;
        point.setY(newY);
        assertEquals(newY,point.getY());
    }

    @Test
    void setXY() {
        Point point =new Point ();
        float newX = 0.5f;
        float newY = 1.9f;
        point.setXY(newX,newY);
        float[] esperado = {0.5f,1.9f};
        assertArrayEquals(esperado,point.getXY());
    }

    @Test
    void testToString() {
        float x = 0.2f;
        float y = 2.1f;
        Point point =new Point (x,y);
        assertEquals("(0.2,2.1)",point.toString());
    }

}