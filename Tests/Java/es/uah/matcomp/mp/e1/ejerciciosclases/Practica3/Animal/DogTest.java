package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog d1 = new Dog("Max");
        assertEquals("Woof", d1.greets());
    }

    @Test
    void testGreets() {
        Dog d1 = new Dog("Max");
        Dog d2 = new Dog("Pepe");
        assertEquals("Woooof", d1.greets(d2));

    }

    @Test
    void testToString() {
        Dog d1 = new Dog("Max");
        assertEquals("Dog[Mammal[Animal[name=Max]]]", d1.toString());

    }
}