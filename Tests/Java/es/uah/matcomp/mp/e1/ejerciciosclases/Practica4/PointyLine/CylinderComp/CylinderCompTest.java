package es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.CylinderComp;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.CircleyCylinder.CircleB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderCompTest {

    @Test
    void getBase() {
        CircleB circle = new CircleB(4);
        CylinderComp c1 = new CylinderComp(circle,6);
        assertEquals(circle,c1.getBase());

    }

    @Test
    void getHeight() {
        CircleB circle = new CircleB(4);
        CylinderComp c1 = new CylinderComp(circle,6);
        assertEquals(6,c1.getHeight());
    }

    @Test
    void setBase() {
        CylinderComp c1 = new CylinderComp();
        CircleB circle = new CircleB(9);
        c1.setBase(circle);
        assertEquals(circle,c1.getBase());
    }

    @Test
    void setHeight() {
        CylinderComp c1 = new CylinderComp();
        c1.setHeight(2);
        assertEquals(2,c1.getHeight());
    }

    @Test
    void testToString() {
        CircleB circle = new CircleB(5);
        CylinderComp c1 = new CylinderComp(circle,10);
        assertEquals("CylinderComp[base=Circle[radius = 5.0, color = red], height=10.0]",c1.toString());
    }
}