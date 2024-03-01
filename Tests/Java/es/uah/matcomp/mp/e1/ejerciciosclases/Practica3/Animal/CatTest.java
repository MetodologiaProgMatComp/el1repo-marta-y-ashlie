package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat c1 = new Cat("Pepillo");
        assertEquals("Meow", c1.greets());
    }

    @Test
    void testToString() {
        Cat c1 = new Cat("Pepe");
        assertEquals("Cat[Mammal[Animal[name=Pepe]]]",c1.toString());
    }
}