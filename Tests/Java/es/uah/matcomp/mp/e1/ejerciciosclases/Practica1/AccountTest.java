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
        assertEquals(balance,Pepo.getBalance());
    }

    @org.junit.jupiter.api.Test
    void credit() {
        int amount = 1000;
        Account Pepi = new Account("212", "Pepi");

        assertEquals();
    }

    @org.junit.jupiter.api.Test
    void debit() {
        public void testDebit() {
            Account account = new Account("123456", "John Doe", 1000);

            assertEquals(1000, account.getBalance());

            account.debit(500);
            assertEquals(500, account.getBalance());

            account.debit(500);
            assertEquals(0, account.getBalance());

            account.debit(500);
            assertEquals(0, account.getBalance());
        }

        @Test
        public void testDebitExceededBalance() {
            Account account = new Account("123456", "John Doe", 1000);

            account.debit(1500);

            assertEquals(1000, account.getBalance());
        }
        }
    }

    @org.junit.jupiter.api.Test
    void transferTo() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}