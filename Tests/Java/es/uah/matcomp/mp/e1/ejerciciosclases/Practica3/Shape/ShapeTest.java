package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s1 = new Shape();
        assertEquals("red",s1.getColor());
        Shape s2 = new Shape("verde", true);
        assertEquals("verde", s2.getColor());
    }

    @Test
    void setColor() {
        Shape s1 = new Shape();
        s1.setColor("naranja");
        assertEquals("naranja", s1.getColor());
    }

    @Test
    void isFilled() {
        Shape s1 = new Shape();
        assertEquals(true,s1.isFilled());
    }

    @Test
    void setFilled() {
        Shape s1 = new Shape();
        s1.setFilled(false);
        assertEquals(false,s1.isFilled());
    }

    @Test
    void testToString() {
        Shape s1 = new Shape();
        assertEquals("shape[color=red,filled=true]",s1.toString());
    }
}