package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Animal;

public class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[Animal[name=" + this.name + "]]";
    }
}
