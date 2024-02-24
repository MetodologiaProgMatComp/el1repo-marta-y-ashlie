package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.ClienteyFactura;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        int id = 2345;
        String name = "Paul";
        int discount = 10;
        Customer customer = new Customer(id, name, discount);
        assertEquals(id,customer.getId());
    }

    @Test
    void getName() {
        int id = 2345;
        String name = "Paul";
        int discount = 10;
        Customer customer = new Customer(id, name, discount);
        assertEquals(name,customer.getName());
    }

    @Test
    void getDiscount() {
        int id = 2345;
        String name = "Paul";
        int discount = 10;
        Customer customer = new Customer(id, name, discount);
        assertEquals(discount,customer.getDiscount());
    }

    @Test
    void setDiscount() {
        int id = 2345;
        String name = "Paul";
        int discount = 10;
        Customer customer = new Customer(id, name, discount);
        int nuevoDiscount = 20;
        customer.setDiscount(nuevoDiscount);
        assertEquals(nuevoDiscount,customer.getDiscount());
    }

    @Test
    void testToString() {
        int id = 2345;
        String name = "Paul";
        int discount = 10;
        Customer customer = new Customer(id, name, discount);
        assertEquals("Paul(2345)(10%)", customer.toString());
    }
}