package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.MovPointCircle;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.Movable.MovablePoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    @Test
    void testToString() {
        MovablePoint p1 = new MovablePoint(1,2,3,4);
        assertEquals("(1,2) speed=(3,4)",p1.toString());
    }

    @Test
    void moveUp() {
        MovablePoint p1 = new MovablePoint(2,3,4,5);
        p1.moveUp();
        assertEquals("(2,-2) speed=(4,5)", p1.toString());
    }

    @Test
    void moveDown() {
        MovablePoint p1 = new MovablePoint(2,3,4,5);
        p1.moveDown();
        assertEquals("(2,8) speed=(4,5)", p1.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint p1 = new MovablePoint(2,3,4,5);
        p1.moveLeft();
        assertEquals("(-2,3) speed=(4,5)", p1.toString());
    }

    @Test
    void moveRight() {
        MovablePoint p1 = new MovablePoint(2,3,4,5);
        p1.moveRight();
        assertEquals("(6,3) speed=(4,5)", p1.toString());
    }

}