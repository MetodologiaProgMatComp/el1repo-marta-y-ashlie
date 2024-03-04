package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void getRadius() {
        double radius = 3.0;
        Circle circle = new Circle(radius);
        assertEquals(radius, circle.getRadius());
    }

    @Test
    void getArea() {
        double radius = 3.0;
        Circle circle = new Circle(radius);
        double areaEsperada = Math.PI * radius * radius;
        assertEquals(areaEsperada, circle.getArea());
    }

    @Test
    void getCircumference() {
        double radius = 2.0;
        Circle circle = new Circle(radius);
        double circumferenciaEsperada = 2 * Math.PI * radius;
        assertEquals(circumferenciaEsperada,circle.getCircumference());

    }
    @Test
    void testToString() {
        double radius = 3.0;
        Circle circle = new Circle(radius);
        assertEquals("Circle[radius = 3.0]", circle.toString());
    }
    @Test
    void setRadius() {
        Circle circle = new Circle();
        double nuevoRadius = 2.9;
        circle.setRadius(nuevoRadius);
        assertEquals(nuevoRadius, circle.getRadius());
    }


}