package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Point2DyPoint3D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D point3D = new Point3D(2.3f,4.3f,1.9f);
        assertEquals(1.9f, point3D.getZ());

    }

    @Test
    void setZ() {
        Point3D point3D = new Point3D();
        point3D.setZ(2.1f);
        assertEquals(2.1f,point3D.getZ());
    }

    @Test
    void getXYZ() {
        Point3D point3D = new Point3D(2.3f,4.3f,1.9f);
        float[] xyz = {2.3f,4.3f,1.9f};
        assertArrayEquals(xyz,point3D.getXYZ());
    }

    @Test
    void testToString() {
        Point3D point3D = new Point3D(2.3f,4.3f,1.9f);
        assertEquals("(2.3,4.3,1.9)",point3D.toString());
    }
}