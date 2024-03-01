package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.AnimalAbstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        BigDog d1 = new BigDog("Max");
        assertEquals("Wooow", d1.greets());
    }

    @Test
    void testGreets() {
        BigDog d1 = new BigDog("Max");
        Dog d2 = new Dog("Maria");
        assertEquals("Woooooow", d1.greets(d2));
    }

    @Test
    void testGreets1() {
        BigDog d1 = new BigDog("Max");
        BigDog d2 = new BigDog("Puchi");
        assertEquals("Woooooooooow", d1.greets(d2));
    }
}