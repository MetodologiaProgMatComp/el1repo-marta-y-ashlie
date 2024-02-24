package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.ClienteyFactura;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        int id = 3456;
        Customer customer = new Customer (9342, "Julieta",20);
        double amount = 32.3;
        Invoice invoice = new Invoice(id,customer,amount);
        assertEquals(id, invoice.getId());

    }

    @Test
    void getCustomer() {
        int id = 3456;
        Customer customer = new Customer (9342, "Julieta",20);
        double amount = 32.3;
        Invoice invoice = new Invoice(id,customer,amount);
        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    void getAmount() {
        int id = 3456;
        Customer customer = new Customer (9342, "Julieta",20);
        double amount = 32.3;
        Invoice invoice = new Invoice(id,customer,amount);
        assertEquals(amount, invoice.getAmount());
    }

    @Test
    void setCustomer() {
        int id = 3456;
        Customer customer = new Customer (9342, "Julieta",20);
        double amount = 32.3;
        Invoice invoice = new Invoice(id,customer,amount);
        Customer nuevoCustomer = new Customer(7843,"Flor",10);
        invoice.setCustomer(nuevoCustomer);
        assertEquals(nuevoCustomer,invoice.getCustomer());

    }

    @Test
    void setAmount() {
        int id = 3456;
        Customer customer = new Customer (9342, "Julieta",20);
        double amount = 32.3;
        Invoice invoice = new Invoice(id,customer,amount);
        double nuevoAmount =31.5;
        invoice.setAmount(nuevoAmount);
        assertEquals(nuevoAmount,invoice.getAmount());
    }

    @Test
    void getCustomerId() {
        int id = 3456;
        Customer customer = new Customer (9342, "Julieta",20);
        double amount = 32.3;
        Invoice invoice = new Invoice(id,customer,amount);
        assertEquals(invoice.getCustomer().getId(),invoice.getCustomerId());
    }

    @Test
    void getCustomerName() {
        int id = 3456;
        Customer customer = new Customer (9342, "Julieta",20);
        double amount = 32.3;
        Invoice invoice = new Invoice(id,customer,amount);
        assertEquals(invoice.getCustomer().getName(),invoice.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        int id = 3456;
        Customer customer = new Customer (9342, "Julieta",20);
        double amount = 32.3;
        Invoice invoice = new Invoice(id,customer,amount);
        assertEquals(invoice.getCustomer().getDiscount(),invoice.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        int id = 3456;
        Customer customer = new Customer (9342, "Julieta",20);
        double amount = 32.3;
        Invoice invoice = new Invoice(id,customer,amount);
        int descuento = invoice.getCustomerDiscount();
        double finalAmount = amount-((amount*descuento)/100);
        assertEquals(finalAmount,invoice.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        int id = 3456;
        Customer customer = new Customer (9342, "Julieta",20);
        double amount = 32.3;
        Invoice invoice = new Invoice(id,customer,amount);
        assertEquals("Invoice [id= 3456, customer = Julieta(9342)(20%), amount = 32.3]",invoice.toString());
    }
}