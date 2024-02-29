package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square s1 = new Square();
        assertEquals(1.0,s1.getSide());
    }

    @Test
    void setSide() {
        Square s1 = new Square();
        s1.setSide(2);
        assertEquals(2,s1.getSide());
    }

    @Test
    void setWidth() {
        Square s1 = new Square();
        s1.setWidth(3);
        assertEquals(3,s1.getSide());
        assertEquals(3,s1.getWidth());
        assertEquals(3,s1.getLength());
    }

    @Test
    void setLength() {
        Square s1 = new Square();
        s1.setLength(2);
        assertEquals(2,s1.getSide());
        assertEquals(2,s1.getLength());
        assertEquals(2,s1.getWidth());
    }

    @Test
    void testToString() {
        Square s1 = new Square(2,"amarillo",false);
        String esperado = "Square[Rectangle[Shape[Color=amarillo,filled=false],width=2.0,length=2.0]]";
        assertEquals(esperado,s1.toString());
    }
}