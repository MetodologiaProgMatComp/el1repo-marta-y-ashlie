package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.Shapee;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void getWidth() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle r1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle();
        assertEquals(1.0,r1.getWidth());
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle r2 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle(2,3);
        assertEquals(2,r2.getWidth());
    }

    @Test
    void setWidth() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle r1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle();
        r1.setWidth(3.3);
        assertEquals(3.3,r1.getWidth());
    }

    @Test
    void getLength() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle r1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle();
        assertEquals(1.0,r1.getLength());
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle r2 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle(2,3);
        assertEquals(3,r2.getLength());
    }

    @Test
    void setLength() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle r1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle();
        r1.setLength(5);
        assertEquals(5,r1.getLength());
    }

    @Test
    void getArea() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle r1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle(2,3);
        assertEquals(6,r1.getArea());
    }

    @Test
    void getPerimeter() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle r1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle(2,3);
        assertEquals(10,r1.getPerimeter());
    }

    @Test
    void testToString() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Rectangle r1 = new Rectangle(3,4,"white",true);
        String esperado = "Rectangle[Shape[Color=white,filled=true],width=3.0,length=4.0]";
        assertEquals(esperado, r1.toString());
    }

}