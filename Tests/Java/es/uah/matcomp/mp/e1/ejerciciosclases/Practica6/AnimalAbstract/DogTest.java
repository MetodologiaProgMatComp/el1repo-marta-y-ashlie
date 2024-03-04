package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.AnimalAbstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog d1 = new Dog("Pepe");
        assertEquals("Woof", d1.greets());
    }

    @Test
    void testGreets() {
        Dog d1 = new Dog("pepe");
        Dog d2 = new Dog("Nunu");
        assertEquals("Woooof", d1.greets(d2));
    }
}