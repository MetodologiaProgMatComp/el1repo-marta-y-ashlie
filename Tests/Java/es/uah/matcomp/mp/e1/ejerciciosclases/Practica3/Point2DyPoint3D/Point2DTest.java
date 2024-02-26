package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Point2DyPoint3D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        float x = 0.2f;
        float y = 2.1f;
        Point2D point2D =new Point2D (x,y);
        assertEquals(x,point2D.getX());

    }

    @Test
    void getY() {
        float x = 0.2f;
        float y = 2.1f;
        Point2D point2D =new Point2D (x,y);
        assertEquals(y,point2D.getY());
    }

    @Test
    void getXY() {
        float x = 0.2f;
        float y = 2.1f;
        Point2D point2D =new Point2D (x,y);
        float[] esperado = {0.2f,2.1f};
        assertArrayEquals(esperado,point2D.getXY());
    }

    @Test
    void setX() {
        float x = 0.2f;
        float y = 2.1f;
        Point2D point2D =new Point2D (x,y);
        float newX =0.8f;
        point2D.setX(newX);
        assertEquals(newX,point2D.getX());
    }

    @Test
    void setY() {
        float x = 0.2f;
        float y = 2.1f;
        Point2D point2D =new Point2D (x,y);
        float newY =0.5f;
        point2D.setY(newY);
        assertEquals(newY,point2D.getY());
    }

    @Test
    void setXY() {
        Point2D point2D =new Point2D ();
        float newX = 0.5f;
        float newY = 1.9f;
        point2D.setXY(newX,newY);
        float[] esperado = {0.5f,1.9f};
        assertArrayEquals(esperado,point2D.getXY());
    }

    @Test
    void testToString() {
        float x = 0.2f;
        float y = 2.1f;
        Point2D point2D =new Point2D (x,y);
        assertEquals("(0.2,2.1)",point2D.toString());
    }
}