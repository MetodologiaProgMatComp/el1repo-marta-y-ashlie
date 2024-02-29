package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1 = new Circle();
        assertEquals(1.0,c1.getRadius());
        Circle c2 = new Circle(2);
        assertEquals(2,c2.getRadius());
    }

    @Test
    void setRadius() {
        Circle c1 = new Circle();
        double radio = 2.5;
        c1.setRadius(radio);
        assertEquals(2.5, c1.getRadius());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle();
        double esperado = Math.PI;
        assertEquals(esperado, c1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle(3);
        double esperado = Math.PI*6;
        assertEquals(esperado, c1.getPerimeter());
    }

    @Test
    void testToString() {
        Circle c1 = new Circle(2,"red", false);
        String esperado = "Circle[Shape[Color=red,filled=flase],radius=2.0]";
        assertEquals(esperado, c1.toString());
    }
}