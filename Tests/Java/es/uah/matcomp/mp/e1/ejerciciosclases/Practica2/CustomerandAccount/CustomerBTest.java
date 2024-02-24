package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.CustomerandAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerBTest {

    @Test
    void getId() {
        int id = 2348;
        String name = "Pedro";
        char gender= 'm';
        CustomerB customerB = new CustomerB(id, name, gender);
        assertEquals(id, customerB.getId());
    }

    @Test
    void getName() {
        int id = 2348;
        String name = "Pedro";
        char gender= 'm';
        CustomerB customerB = new CustomerB(id, name, gender);
        assertEquals(name, customerB.getName());
    }

    @Test
    void getGender() {
        int id = 2348;
        String name = "Pedro";
        char gender= 'm';
        CustomerB customerB = new CustomerB(id, name, gender);
        assertEquals(gender, customerB.getGender());
    }

    @Test
    void testToString() {
        int id = 2348;
        String name = "Pedro";
        char gender= 'm';
        CustomerB customerB = new CustomerB(id, name, gender);
        assertEquals("Pedro(2348)", customerB.toString());
    }
}