package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.GeometricObject;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.GeometricObject.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle(1,3);
        assertEquals("Rectangle[width=1.0,length=3.0]", r1.toString());
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle(2,3);
        assertEquals(6,r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(3,4);

        assertEquals(14, r1.getPerimeter()
        );
    }
}