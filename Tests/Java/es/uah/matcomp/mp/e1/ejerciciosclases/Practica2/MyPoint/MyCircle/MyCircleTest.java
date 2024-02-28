package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyCircle;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Circle.Circle;
import es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadius() {
        MyCircle c1 = new MyCircle(2,3,4);
        assertEquals(4,c1.getRadius());
    }

    @Test
    void setRadius() {
        MyCircle c1 = new MyCircle(1,2,3);
        int radius = 2;
        c1.setRadius(radius);
        assertEquals(2,c1.getRadius());
    }

    @Test
    void getCenter() {
        MyCircle c1 = new MyCircle(2,3,4);
        MyPoint p1 = new MyPoint(2,3);
        assertEquals(p1.getX(),c1.getCenter().getX());
        assertEquals(p1.getY(),c1.getCenter().getY());

    }

    @Test
    void setCenter() {
        MyCircle c1 = new MyCircle(1,2,3);
        MyPoint p1 = new MyPoint(5,6);
        c1.setCenter(p1);

        assertEquals(p1.getX(),c1.getCenter().getX());
        assertEquals(p1.getY(),c1.getCenter().getY());
    }

    @Test
    void getCenterX() {
        MyCircle c1 = new MyCircle(1,2,3);

        assertEquals(1,c1.getCenterX());
    }

    @Test
    void getCenterY() {
        MyCircle c1 = new MyCircle(1,2,3);
        assertEquals(2, c1.getCenterY());
    }

    @Test
    void setCenterX() {
        MyCircle c1 = new MyCircle(1,2,3);
        int nx = 4;
        c1.setCenterX(nx);
        assertEquals(nx, c1.getCenterX());
    }

    @Test
    void setCenterY() {
        MyCircle c1 = new MyCircle(1,2,3);
        int ny = 4;
        c1.setCenterY(ny);
        assertEquals(ny, c1.getCenterY());
    }

    @Test
    void getCenterXY() {
        MyCircle c1 = new MyCircle(1,2,3);
        int[] esperado = new int[] {1,2};
        assertArrayEquals(esperado, c1.getCenterXY());
    }

    @Test
    void setCenterXY() {
        MyCircle c1 = new MyCircle(1,2,3);
        int x = 8;
        int y = 0;
        int[] esperado = new int[] {8,0};
        c1.setCenterXY(x,y);
        assertArrayEquals(esperado, c1.getCenterXY());
    }

    @Test
    void testToString() {
        MyCircle c1 = new MyCircle(1,2,3);
        assertEquals("MyCircle[radius=3,center=(1,2)",c1.toString());
    }

    @Test
    void getArea() {
        MyCircle c1 = new MyCircle(1, 2, 3);
        double area = Math.PI*9;
        assertEquals(area,c1.getArea());
    }

    @Test
    void getCircumference() {
        MyCircle c1 = new MyCircle(1,2,3);
        double esperado = 6*Math.PI;
        assertEquals(esperado,c1.getCircumference());
    }

    @Test
    void distance() {
        MyCircle c1= new MyCircle(3,4,3);
        MyCircle c2 = new MyCircle(6,8,2);
        double disesperada = 5;
        assertEquals(disesperada,c1.distance(c2));
    }
}