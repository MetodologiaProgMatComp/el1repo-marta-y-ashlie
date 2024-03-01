package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.AnimalAbstract;

public class MainTestAnimal {
    public static void main(String[] args){
        Cat c2 = new Cat("Pepillo");
        System.out.println("Saluda pepillo: " + c2.greets());

        Dog d1 = new Dog("Max");
        System.out.println("Saluda Max: " + d1.greets());
        Dog d2 = new Dog("Pepe");
        System.out.println("Max se encuentra a otro perrito: " + d1.greets(d2));


        BigDog b1 = new BigDog("Tyler");
        System.out.println("Saluda Tyler: " + b1.greets());
        Dog d3 = new Dog("Canela");
        System.out.println("Tyler se encontró a canela: " + b1.greets(d3));
        BigDog b2 = new BigDog("Omegadon");
        System.out.println("Tyler se encontró con Omegadon: " + b1.greets(b2));
    }
}
