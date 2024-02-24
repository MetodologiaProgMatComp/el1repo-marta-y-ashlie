package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.CustomerandAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        int id = 321;
        CustomerB customerB = new CustomerB(765,"Ana", 'f');
        double balance = 345.2;
        Account account =new Account(id, customerB,balance);
        assertEquals(id,account.getId());
    }

    @Test
    void getCustomer() {
        int id = 321;
        CustomerB customerB = new CustomerB(765,"Ana", 'f');
        double balance = 345.2;
        Account account =new Account(id, customerB,balance);
        assertEquals(customerB,account.getCustomer());
    }

    @Test
    void getBalance() {
        int id = 321;
        CustomerB customerB = new CustomerB(765,"Ana", 'f');
        double balance = 345.2;
        Account account =new Account(id, customerB,balance);
        assertEquals(balance,account.getBalance());
    }

    @Test
    void setBalance() {
        int id = 321;
        CustomerB customerB = new CustomerB(765,"Ana", 'f');
        double balance = 345.2;
        Account account =new Account(id, customerB,balance);
        double newBalance = 3234.5;
        account.setBalance(newBalance);
        assertEquals(newBalance,account.getBalance());
    }

    @Test
    void testToString() {
        int id = 321;
        CustomerB customerB = new CustomerB(765,"Ana", 'f');
        double balance = 345.2;
        Account account =new Account(id, customerB,balance);
        assertEquals("Ana(765)balance = 345,20", account.toString());
    }

    @Test
    void getCustomerName() {
        int id = 321;
        CustomerB customerB = new CustomerB(765,"Ana", 'f');
        double balance = 345.2;
        Account account =new Account(id, customerB,balance);
        assertEquals(customerB.getName(),account.getCustomerName());

    }

    @Test
    void deposit() {
        int id = 321;
        CustomerB customerB = new CustomerB(765,"Ana", 'f');
        double balance = 345.2;
        Account account =new Account(id, customerB,balance);
        double cantidadAgregada = 100;
        assertEquals(balance+cantidadAgregada,account.deposit(cantidadAgregada).getBalance());

    }

    @Test
    void withdraw() {
        int id = 321;
        CustomerB customerB = new CustomerB(765,"Ana", 'f');
        double balance = 345.2;
        Account account =new Account(id, customerB,balance);
        double amount = 100;
        assertEquals(balance-amount,account.withdraw(amount).getBalance());

    }
}