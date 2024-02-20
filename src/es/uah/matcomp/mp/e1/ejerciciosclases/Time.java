package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hora, int minuto, int segundo){     //Constructor que crea un objeto de la clase time
        hour = hora;
        minute = minuto;
        second = segundo;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hora, int minuto, int segundo) {
        hour= hora;
        minute= minuto;
        second= segundo;
    }
    public String toString() {
        return hour +":" + minute + ":" + second;
    }
    public Time nextSecond() {
        second ++;
        return this;
    }
    public Time previousSecond() {
        second --;
        return this;
    }
}
