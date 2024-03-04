package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Animal;

public class Cat extends Mammal{
    public Cat(String name){
        super(name);
    }
    public String greets(){     //Greets no puede printear directamente, lo correcto es que devuelva Meow.
        return "Meow";
    }
    public String toString() {
        return "Cat[Mammal[Animal[name=" + this.name + "]]]";
    }
}
