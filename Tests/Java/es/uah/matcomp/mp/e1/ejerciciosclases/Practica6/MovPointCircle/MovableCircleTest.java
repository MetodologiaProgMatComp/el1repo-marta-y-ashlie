package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.MovPointCircle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle c1 = new MovableCircle(2,1,2,2,3);
        assertEquals("(2,1),speed=(2,2),radius=3", c1.toString());
    }

    @Test
    void moveUp() {
        MovableCircle c1 = new MovableCircle(2,1,2,2,3);
        c1.moveUp();
        assertEquals("(2,3),speed=(2,2),radius=3", c1.toString());
    }

    @Test
    void moveDown() {
        MovableCircle c1 = new MovableCircle(2,1,2,2,3);
        c1.moveDown();
        assertEquals("(2,-1),speed=(2,2),radius=3", c1.toString());

    }

    @Test
    void moveLeft() {
        MovableCircle c1 = new MovableCircle(2,1,2,2,3);
        c1.moveLeft();
        assertEquals("(0,1),speed=(2,2),radius=3", c1.toString());

    }

    @Test
    void moveRight() {
        MovableCircle c1 = new MovableCircle(2,1,2,2,3);
        c1.moveRight();
        assertEquals("(4,1),speed=(2,2),radius=3", c1.toString());

    }
}