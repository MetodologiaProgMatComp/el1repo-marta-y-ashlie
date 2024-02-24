package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.AuthoryBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        String name = "Luis Rojas";
        String email = "Luis.RS@gmail.com";
        Author author = new Author(name,email);
        assertEquals(name,author.getName());
    }

    @Test
    void getEmail() {
        String name = "Luis Rojas";
        String email = "Luis.RS@gmail.com";
        Author author = new Author(name,email);
        assertEquals(email,author.getEmail());
    }

    @Test
    void setEmail() {
        String name = "Luis Rojas";
        String email = "Luis.RS@gmail.com";
        Author author = new Author(name,email);
        String nuevoEmail = "Luis.Rosas@gmail.com";
        author.setEmail(nuevoEmail);
        assertEquals(nuevoEmail,author.getEmail());
    }

    @Test
    void testToString() {
        String name = "Luis Rojas";
        String email = "Luis.RS@gmail.com";
        Author author = new Author(name,email);
        assertEquals("Author [name = Luis Rojas, email = Luis.RS@gmail.com]", author.toString());

    }
}