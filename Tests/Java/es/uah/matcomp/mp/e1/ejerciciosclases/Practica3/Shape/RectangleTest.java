package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle r1 = new Rectangle();
        assertEquals(1.0,r1.getWidth());
        Rectangle r2 = new Rectangle(2,3);
        assertEquals(2,r2.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r1 = new Rectangle();
        r1.setWidth(3.3);
        assertEquals(3.3,r1.getWidth());
    }

    @Test
    void getLength() {
        Rectangle r1 = new Rectangle();
        assertEquals(1.0,r1.getLength());
        Rectangle r2 = new Rectangle(2,3);
        assertEquals(3,r2.getLength());
    }

    @Test
    void setLength() {
        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        assertEquals(5,r1.getLength());
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle(2,3);
        assertEquals(6,r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(2,3);
        assertEquals(10,r1.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle(3,4,"white",true);
        String esperado = "Rectangle[Shape[Color=white,filled=true],width=3.0,length=4.0]";
        assertEquals(esperado, r1.toString());
    }
}