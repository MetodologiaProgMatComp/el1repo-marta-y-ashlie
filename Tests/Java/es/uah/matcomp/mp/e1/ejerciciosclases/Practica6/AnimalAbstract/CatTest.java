package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.AnimalAbstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat c1 = new Cat("Meiga");
        assertEquals("Meow", c1.greets());
    }
}