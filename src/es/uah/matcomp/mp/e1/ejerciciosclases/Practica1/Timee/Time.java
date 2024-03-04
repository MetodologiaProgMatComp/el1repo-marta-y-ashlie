package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Timee;

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
        int res;

        if(hour>=0 && hour<=24){
            res = this.hour;
            if(this.hour==24)
                res = 0;
        }
        else
            res = -1;       //hora invalida
        return res;
    }

    public int getMinute() {
        int res;
        if(this.minute>=0 && this.minute<=60){
            res = this.minute;
            if(this.minute==60)
                res = 00;
        }
        else
            res = -1;       //Minuto invalido
        return res;
    }

    public int getSecond() {
        int res;
        if(this.second>=0 && this.second<=60) {
            res = this.second;
            if(this.second==60)
                res = 00;
        }
        else
            res = -1;       //Segundo invalido
        return res;
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
        return this.hour +":" + this.minute + ":" + this.second;
    }
    public Time nextSecond() {
        if(this.second==59){
            this.second = 0;
            if(this.minute == 59){
                this.minute = 0;
                if(this.hour == 23){
                    this.hour = 0;
                }
            }
        } else {
            this.second ++;}
        return this;
    }
    public Time previousSecond() {
        if(this.second == 00){
            this.second = 59;
            if(this.minute==00){
                this.minute = 59;
                if(this.hour == 00){
                    this.hour = 23;
                } else
                    this.hour--;
            }
        } else{
            this.second --;
        }
        return this;
    }
}
