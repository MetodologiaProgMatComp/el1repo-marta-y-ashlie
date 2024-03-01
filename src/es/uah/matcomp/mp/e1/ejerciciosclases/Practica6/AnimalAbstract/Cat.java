package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.AnimalAbstract;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public String greets(){
        return "Meow";
    }
}
