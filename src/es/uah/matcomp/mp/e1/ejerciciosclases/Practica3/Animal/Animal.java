package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Animal;

public class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[name=" + this.name + "]";
    }

}
