package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void testToString() {
        Cat c1 = new Cat("Pepe");
        assertEquals("Cat[Mammal[Animal[name=Pepe]]]",c1.toString());
    }
}