package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.CircleyCylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    @Test
    void setHeight(){
        Cylinder cylinder = new Cylinder();
        double nuevoHeight = 2.0;
        cylinder.setHeight(nuevoHeight);
        assertEquals(nuevoHeight,cylinder.getHeight());
    }

    @Test
    void getHeight() {
        Cylinder cylinder = new Cylinder();
        double newHeight = 2.0;
        cylinder.setHeight(newHeight);
        assertEquals(newHeight,cylinder.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder cylinder = new Cylinder();
        double newHeight = 2.0;
        cylinder.setHeight(newHeight);
        double volumeEsperado = cylinder.getArea()*newHeight;
        assertEquals(volumeEsperado, cylinder.getVolume());
    }

    @Test
    void testToString() {
        Cylinder cylinder = new Cylinder(2,4,"red");

        assertEquals("Cylinder: subclass of Circle[radius = 2.0, color = red]height = 4.0", cylinder.toString());
    }
}