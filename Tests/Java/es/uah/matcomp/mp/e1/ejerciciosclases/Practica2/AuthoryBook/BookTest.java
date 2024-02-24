package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.AuthoryBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        String isbn= "45678";
        String name = "Narnia";
        Author author = new Author ("Clive Staples Lewis","Clive@gmail.com");
        double price = 12;
        Book book = new Book(isbn,name,author,price);
        assertEquals(isbn,book.getIsbn());
    }

    @Test
    void getName() {
        String isbn= "45678";
        String name = "Narnia";
        Author author = new Author ("Clive Staples Lewis","Clive@gmail.com");
        double price = 12;
        Book book = new Book(isbn,name,author,price);
        assertEquals(name,book.getName());
    }

    @Test
    void getAuthor() {
        String isbn= "45678";
        String name = "Narnia";
        Author author = new Author ("Clive Staples Lewis","Clive@gmail.com");
        double price = 12;
        Book book = new Book(isbn,name,author,price);
        assertEquals(author,book.getAuthor());
    }

    @Test
    void getPrice() {
        String isbn= "45678";
        String name = "Narnia";
        Author author = new Author ("Clive Staples Lewis","Clive@gmail.com");
        double price = 12;
        Book book = new Book(isbn,name,author,price);
        assertEquals(price,book.getPrice());
    }

    @Test
    void getQty() {
        String isbn= "45678";
        String name = "Narnia";
        Author author = new Author ("Clive Staples Lewis","Clive@gmail.com");
        double price = 12;
        int qty = 2;
        Book book = new Book(isbn,name,author,price,qty);
        assertEquals(qty,book.getQty());
    }

    @Test
    void getAuthorName() {
        String isbn= "45678";
        String name = "Narnia";
        Author author = new Author ("Clive Staples Lewis","Clive@gmail.com");
        double price = 12;
        Book book = new Book(isbn,name,author,price);
        assertEquals("Clive Staples Lewis",book.getAuthor().getName());
    }

    @Test
    void setPrice() {
        String isbn= "45678";
        String name = "Narnia";
        Author author = new Author ("Clive Staples Lewis","Clive@gmail.com");
        double price = 12;
        Book book = new Book(isbn,name,author,price);
        double nuevoPrice = 10;
        book.setPrice(nuevoPrice);
        assertEquals(nuevoPrice,book.getPrice());
    }

    @Test
    void setQty() {
        String isbn= "45678";
        String name = "Narnia";
        Author author = new Author ("Clive Staples Lewis","Clive@gmail.com");
        double price = 12;
        int qty = 4;
        Book book = new Book(isbn,name,author,qty);
        int nuevoQty = 8;
        book.setQty(nuevoQty);
        assertEquals(nuevoQty,book.getQty());
    }

    @Test
    void testToString() {
        String isbn= "45678";
        String name = "Narnia";
        Author author = new Author ("Clive Staples Lewis","Clive@gmail.com");
        double price = 12;
        int qty = 2;
        Book book = new Book(isbn,name,author,price,qty);
        assertEquals("Book [isbn = 45678, name = Narnia, Author[name = Clive Staples Lewis, email = Clive@gmail.com ], price = 12.0, qty = 2]", book.toString());
    }
}