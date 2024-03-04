package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Animal;

public class MainTestAnimal {
    public static void main(String[] args){
        Animal a1 = new Animal("Ashlie");
        System.out.println("Mi nuevo animal es: " + a1);

        Animal a2 = new Mammal("Manolo");
        System.out.println("Mi nuevo mamífero se llama: " + a2);

        Mammal m1 = (Mammal)a2;
        System.out.println("Mi nuevo mamífero sigue llamámndose: " + m1);

        Animal a3 = new Cat("Pepillo");
        System.out.println("Mi nuevo gato se llama: " + a3);
        Cat c1 = (Cat) a3;
        System.out.println("Mi gato sigue llamándose: " + c1);
        System.out.println("Mi gato te saluda: " + c1.greets());

        Animal a4 = new Dog("Max");
        System.out.println("Mi perro se llama: " + a4);
        Dog d1 =(Dog)a4;
        System.out.println("Mi perro sigue llamándose: " + d1);
        System.out.println("Mi perro te saluda: " + d1.greets());
        Dog d2 = new Dog("Alonso");
        System.out.println("Max se encontró con Alonso: " + d1.greets(d2));
    }


}
