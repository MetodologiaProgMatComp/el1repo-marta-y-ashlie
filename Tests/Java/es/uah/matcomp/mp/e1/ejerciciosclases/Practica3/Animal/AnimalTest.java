package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal a1 = new Animal("Gorila");
        assertEquals("Animal[name=Gorila]",a1.toString());
    }
}