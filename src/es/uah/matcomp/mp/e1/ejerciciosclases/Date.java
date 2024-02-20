package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Date {
    private int day;

    private int month;

    private int year;

    //Métodos

    public Date(int dia, int mes, int año) {
        day=dia;
        month=mes;
        year=año;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day>= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("El día introducido no es correcto");
        }
    }


    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int dia, int mes, int año) {
        day= dia;
        month= mes;
        year= año;
    }
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
