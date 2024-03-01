package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.AnimalAbstract;

public abstract class Animal {
    private String name;
    public  Animal(String name){
        this.name = name;
    }
    public abstract String greets();
}
