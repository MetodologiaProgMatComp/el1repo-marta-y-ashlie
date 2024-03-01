package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.ResizableGeometricObj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle r1 = new ResizableCircle(2);
        assertEquals("ResizableCircle[Circle[radius=2.0]]", r1.toString());
    }

    @Test
    void resize() {
        ResizableCircle r1 = new ResizableCircle(10);
        r1.resize(10);
        assertEquals("ResizableCircle[Circle[radius=1.0]]",r1.toString());
    }
}