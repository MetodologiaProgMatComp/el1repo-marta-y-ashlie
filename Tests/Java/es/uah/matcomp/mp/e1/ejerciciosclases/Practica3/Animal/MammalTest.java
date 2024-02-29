package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Mammal m1 = new Mammal("Humano");
        assertEquals("Mammal[Animal[name=Humano]]",m1.toString());
    }
}