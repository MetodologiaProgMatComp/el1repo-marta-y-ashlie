package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.ImplementacionAlternativaDiagrama;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        /**Cat cat1 = new Cat();
        cat1.greeting();        /**Meow
        Dog dog1 = new Dog();
        dog1.greeting();        /**Woof!
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();     /**Woow!

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();     /**Meow
        Animal animal2 = new Dog();
        animal2.greeting();     /**Woof!
        Animal animal3 = new BigDog();
        animal3.greeting();     /**Woow!
        Animal animal4 = new Animal();      /**No es instanciable

        // Downcast
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        Cat cat2 = (Cat) animal2;   /**No se puede convertir un perro en un gato
        dog2.greeting(dog3);        /**Wooooooooof!
        dog3.greeting(dog2);        /**Wooooooooof!
        dog2.greeting(bigDog2);     /**Wooooooooof!
        bigDog2.greeting(dog2);     /**Wooooooowwww!
        bigDog2.greeting(bigDog1);      /**Wooooooowwww!*/
    }
}
