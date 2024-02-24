package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.AuthoryBook;

public class Author {
    String name;
    String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "Author [name = " + name + ", email = "+email + "]";
    }
}
