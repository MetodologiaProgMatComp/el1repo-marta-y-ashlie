package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.Shapee;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape s1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape();
        assertEquals("red",s1.getColor());
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape s2 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape("verde", true);
        assertEquals("verde", s2.getColor());
    }

    @Test
    void setColor() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape s1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape();
        s1.setColor("naranja");
        assertEquals("naranja", s1.getColor());
    }

    @Test
    void isFilled() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape s1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape();
        assertEquals(true,s1.isFilled());
    }

    @Test
    void setFilled() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape s1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape();
        s1.setFilled(false);
        assertEquals(false,s1.isFilled());
    }

    @Test
    void testToString() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Shape s1 = new Shape();
        assertEquals("shape[color=red,filled=true]",s1.toString());
    }
}