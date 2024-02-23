package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.InvoiceItem;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Rectangle.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        String id = "abc";
        String desc = "cincuenta";
        int qty = 4;
        double unitPrice = 2.5;
        InvoiceItem invoiceItem = new InvoiceItem(id,desc,qty,unitPrice);
        assertEquals(id,invoiceItem.getId());
    }

    @Test
    void getDesc() {
        String id = "abc";
        String desc = "cincuenta";
        int qty = 4;
        double unitPrice = 2.5;
        InvoiceItem invoiceItem = new InvoiceItem(id,desc,qty,unitPrice);
        assertEquals(desc,invoiceItem.getDesc());
    }

    @Test
    void getQty() {
        String id = "abc";
        String desc = "cincuenta";
        int qty = 4;
        double unitPrice = 2.5;
        InvoiceItem invoiceItem = new InvoiceItem(id,desc,qty,unitPrice);
        assertEquals(qty,invoiceItem.getQty());
    }

    @Test
    void getUnitPrice() {
        String id = "abc";
        String desc = "cincuenta";
        int qty = 4;
        double unitPrice = 2.5;
        InvoiceItem invoiceItem = new InvoiceItem(id,desc,qty,unitPrice);
        assertEquals(unitPrice,invoiceItem.getUnitPrice());
    }

    @Test
    void getTotal() {
        String id = "abc";
        String desc = "cincuenta";
        int qty = 4;
        double unitPrice = 2.5;
        double totalEsperado = unitPrice * qty;
        InvoiceItem invoiceItem = new InvoiceItem(id,desc,qty,unitPrice);
        assertEquals(totalEsperado,invoiceItem.getTotal());
    }

    @Test
    void setQty() {
        String id = "abc";
        String desc = "cincuenta";
        int qty = 4;
        double unitPrice = 2.5;
        InvoiceItem invoiceItem = new InvoiceItem(id,desc,qty,unitPrice);
        int nuevoQty = 2;
        invoiceItem.setQty(nuevoQty);
        assertEquals(nuevoQty, invoiceItem.getQty());
    }

    @Test
    void setUnitPrice() {
        String id = "abc";
        String desc = "cincuenta";
        int qty = 4;
        double unitPrice = 2.5;
        InvoiceItem invoiceItem = new InvoiceItem(id,desc,qty,unitPrice);
        double nuevoUnitPrice = 4;
        invoiceItem.setUnitPrice(nuevoUnitPrice);
        assertEquals(nuevoUnitPrice, invoiceItem.getUnitPrice());
    }

    @Test
    void testToString() {
        String id = "abc";
        String desc = "cincuenta";
        int qty = 4;
        double unitPrice = 2.5;
        InvoiceItem invoiceItem = new InvoiceItem(id,desc,qty,unitPrice);
        assertEquals("InvoiceItem[id= abc, desc = cincuenta, qty = 4, unitPrice = 2.5]", invoiceItem.toString());
    }
}