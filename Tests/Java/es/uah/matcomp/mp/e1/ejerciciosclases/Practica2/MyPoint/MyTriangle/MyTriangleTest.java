package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle t1 = new MyTriangle(1,2,3,4,5,6);

        assertEquals("MyTriangle[v1=(1,2), v2=(3,4), v3=(5,6)]", t1.toString());
    }

    @Test
    void getPerimeter() {
        MyTriangle t1 = new MyTriangle(3,4,6,8,0,0);
        double perim = t1.getPerimeter();
        int esperado = 20;
        assertEquals(esperado, perim);
    }

    @Test
    void getType() {
        MyTriangle t1 = new MyTriangle(0,0,0,0,0,0);
        assertEquals("Equilatero", t1.getType());

        MyTriangle t2 = new MyTriangle(3,4,6,8,9,12);
        assertEquals("Isosceles", t2.getType());

        MyTriangle t3 = new MyTriangle(28,3,5,0,6,2);
        assertEquals("Escaleno", t3.getType());
    }
}