package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.AuthoryBook;

public class Book {
    String isbn;
    String name;
    Author author;
    double price;
    int qty = 0;

    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getAuthorName(){
        return author.toString();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(){
        return "Book [isbn = "+ isbn + ", name = " + name + ", Author[name = " + author.getName() + ", email = " + author.getEmail() + " ]" + ", price = "+ price +  ", qty = "+qty+"]";
    }
}
