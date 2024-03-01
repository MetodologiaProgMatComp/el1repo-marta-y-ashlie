package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.PointMovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getXSpeed() {
        MovablePoint p1 = new MovablePoint(2,3);
        assertEquals(2,p1.getXSpeed());
    }

    @Test
    void setXSpeed() {
        MovablePoint p1 = new MovablePoint(2,3);
        p1.setXSpeed(4.3f);
        assertEquals(4.3f,p1.getXSpeed());
    }

    @Test
    void getYSpeed() {
        MovablePoint p1 = new MovablePoint(2,3);
        assertEquals(3,p1.getYSpeed());
    }

    @Test
    void setYSpeed() {
        MovablePoint p1 = new MovablePoint(1,2);
        p1.setYSpeed(4.4f);
        assertEquals(4.4f, p1.getYSpeed());
    }

    @Test
    void setSpeed() {
        MovablePoint p1 = new MovablePoint(3,4);
        float x = 3.2f;
        float y = 0.3f;
        p1.setSpeed(x,y);
        assertEquals(3.2f,p1.getXSpeed());
        assertEquals(0.3f,p1.getYSpeed());
    }

    @Test
    void getSpeed() {
        MovablePoint p1 = new MovablePoint(2,3);
        float[] esperado = new float[] {2,3};
        assertArrayEquals(esperado, p1.getSpeed());
    }

    @Test
    void testToString() {
        MovablePoint p1 = new MovablePoint(1,2,3,4);
        assertEquals("(" + p1.getX() + "," + p1.getY() + "),speed=(" + p1.getXSpeed() + "," + p1.getYSpeed() + ")",p1.toString());
    }

    @Test
    void move() {
        MovablePoint p1 = new MovablePoint(1,2,3,4);
        p1.move();
        float[] esperado = new float[] {4,6};
        assertArrayEquals(esperado,p1.getXY());
    }
}