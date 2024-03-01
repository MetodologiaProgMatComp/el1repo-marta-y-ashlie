package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.ResizableGeometricObj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToString() {
        Circle c1 = new Circle(2);
        assertEquals("Circle[radius=2.0]", c1.toString());
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle(3);
        double esperado = Math.PI*6;
        assertEquals(esperado,c1.getPerimeter());
    }

    @Test
    void getArea() {
        Circle c1  = new Circle(3);
        double esperado = Math.PI*9;
        assertEquals(esperado,c1.getArea());
    }
}