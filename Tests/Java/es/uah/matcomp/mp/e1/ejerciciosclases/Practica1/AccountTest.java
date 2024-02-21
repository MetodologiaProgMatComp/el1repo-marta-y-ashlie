package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void getID() {
        Account Pepe = new Account("223", "Pepe");
        assertEquals("223",Pepe.getID());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Account Pepa = new Account("2", "Pepa");
        assertEquals("Pepa", Pepa.getName());
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        int balance = 1000;
        Account Pepo = new Account("2232","Pepo",balance);
        assertEquals();
    }

    @org.junit.jupiter.api.Test
    void credit() {
    }

    @org.junit.jupiter.api.Test
    void debit() {
    }

    @org.junit.jupiter.api.Test
    void transferTo() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}