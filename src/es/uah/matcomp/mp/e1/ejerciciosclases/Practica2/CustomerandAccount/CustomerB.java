package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.CustomerandAccount;

public class CustomerB {
    int id;
    String name;
    char gender;

    public CustomerB(int id, String name, char gender){
        this.id = id;
        this.name = name;
        this.gender= gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
        return name+"("+id+")";
    }
}
