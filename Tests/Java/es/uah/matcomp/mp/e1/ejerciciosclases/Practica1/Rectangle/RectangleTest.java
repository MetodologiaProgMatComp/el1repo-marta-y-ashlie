package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Rectangle;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Circle.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle();
        float nuevoLength = 2;
        rectangle.setLength(nuevoLength);
        assertEquals(nuevoLength,rectangle.getLength());
    }

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle();
        float nuevoWidth = 2;
        rectangle.setWidth(nuevoWidth);
        assertEquals(nuevoWidth,rectangle.getWidth());
    }

    @Test
    void setLength() {
        Rectangle rectangle = new Rectangle();
        float nuevoLength = 2;
        rectangle.setLength(nuevoLength);
        assertEquals(nuevoLength, rectangle.getLength());
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle();
        float nuevoWidth = 3;
        rectangle.setWidth(nuevoWidth);
        assertEquals(nuevoWidth,rectangle.getWidth());
    }

    @Test
    void getArea() {
        float Length = 3;
        float Width = 4;
        Rectangle rectangle = new Rectangle(Length,Width);
        float areaEsperada = Length * Width;
        assertEquals(areaEsperada,rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        float Length = 3;
        float Width = 4;
        Rectangle rectangle = new Rectangle(Length,Width);
        float perimeterEsperado = (Length * 2) + (Width * 2);
        assertEquals(perimeterEsperado,rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        float Length = 3;
        float Width = 4;
        Rectangle rectangle = new Rectangle(Length,Width);
        assertEquals("Rectangle [Length = 3.0 Width = 4.0]", rectangle.toString());
    }
}