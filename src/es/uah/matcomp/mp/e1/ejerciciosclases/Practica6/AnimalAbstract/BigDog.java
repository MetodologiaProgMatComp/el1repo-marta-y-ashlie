package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.AnimalAbstract;

public class BigDog extends Dog {
    public BigDog(String name){
        super(name);
    }
    @Override
    public String greets() {
        return "Wooow";
    }
    public String greets(Dog another){
        return "Woooooow";
    }
    public String greets(BigDog another){
        return "Woooooooooow";
    }
}
