package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Personysubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        String name = "Miriam";
        String address = "Eras Blancas 2";
        Person person = new Person (name,address);
        assertEquals(name,person.getName());
    }

    @Test
    void getAddress() {
        String name = "Miriam";
        String address = "Eras Blancas 2";
        Person person = new Person (name,address);
        assertEquals(address,person.getAddress());
    }

    @Test
    void setAddress() {
        String name = "Miriam";
        String address = "Eras Blancas 2";
        Person person = new Person (name,address);
        String newAddress = "Las Rosas 4";
        person.setAddress(newAddress);
        assertEquals(newAddress,person.getAddress());
    }

    @Test
    void testToString() {
        String name = "Miriam";
        String address = "Eras Blancas 2";
        Person person = new Person (name,address);
        assertEquals("Person[name = Miriam, address = Eras Blancas 2]", person.toString());
    }
}