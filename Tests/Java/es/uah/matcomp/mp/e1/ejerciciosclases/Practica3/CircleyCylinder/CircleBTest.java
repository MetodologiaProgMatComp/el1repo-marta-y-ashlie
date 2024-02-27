package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.CircleyCylinder;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Circle.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleBTest {

    @Test
    void getRadius() {
        double radius = 3.0;
        CircleB circle = new CircleB(radius);
        assertEquals(radius, circle.getRadius());
    }

    @Test
    void getColor() {
        double radius = 3.0;
        String color = "purple";
        CircleB circle = new CircleB(radius,color);
        assertEquals(color, circle.getColor());
    }

    @Test
    void setRadius() {
        CircleB circle = new CircleB();
        double nuevoRadius = 2.5;
        circle.setRadius(nuevoRadius);
        assertEquals(nuevoRadius, circle.getRadius());
    }

    @Test
    void setColor() {
        double radius = 2.9;
        CircleB circle = new CircleB(radius);
        String nuevoColor = "blue";
        circle.setColor(nuevoColor);
        assertEquals(nuevoColor, circle.getColor());
    }

    @Test
    void getArea() {
        double radius = 2.0;
        Circle circle = new Circle(radius);
        double areaEsperada = Math.PI * radius * radius;
        assertEquals(areaEsperada, circle.getArea());
    }

    @Test
    void testToString() {
        double radius = 3.0;
        String color = "purple";
        CircleB circle = new CircleB(radius,color);
        assertEquals("Circle[radius = 3.0, color = purple]", circle.toString());
    }
}