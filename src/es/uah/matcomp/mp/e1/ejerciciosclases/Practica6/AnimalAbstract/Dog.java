package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.AnimalAbstract;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public String greets(){
        return "Woof";
    }
    public String greets(Dog another){
        return "Woooof";
    }

}
