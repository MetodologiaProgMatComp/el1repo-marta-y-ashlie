package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.Shapee;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle c1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle();
        assertEquals(1.0,c1.getRadius());
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle c2 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle(2);
        assertEquals(2,c2.getRadius());
    }

    @Test
    void setRadius() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle c1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle();
        double radio = 2.5;
        c1.setRadius(radio);
        assertEquals(2.5, c1.getRadius());
    }

    @Test
    void getArea() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle c1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle();
        double esperado = Math.PI;
        assertEquals(esperado, c1.getArea());
    }

    @Test
    void getPerimeter() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle c1 = new es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle(3);
        double esperado = Math.PI*6;
        assertEquals(esperado, c1.getPerimeter());
    }

    @Test
    void testToString() {
        es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Shape.Circle c1 = new Circle(2,"red", false);
        String esperado = "Circle[Shape[Color=red,filled=false],radius=2.0]";
        assertEquals(esperado, c1.toString());
    }
}