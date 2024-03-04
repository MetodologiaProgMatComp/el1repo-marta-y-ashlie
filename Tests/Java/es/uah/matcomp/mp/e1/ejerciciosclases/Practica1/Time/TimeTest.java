

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Timee.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    void getHour() {
        Time t1 = new Time(1,2,3);
        assertEquals(1, t1.getHour());

        Time t2 = new Time(24,23,23);
        assertEquals(0,t2.getHour());

        Time t3 = new Time(33,3,3);
        assertEquals(-1,t3.getHour());
    }

    @Test
    void getMinute() {
        Time t1 = new Time(1,2,3);
        assertEquals(2, t1.getMinute());

        Time t2 = new Time(24,60,60);
        assertEquals(0,t2.getMinute());

        Time t3 = new Time(23,61,3);
        assertEquals(-1,t3.getMinute());
    }

    @Test
    void getSecond() {
        Time t1 = new Time(1,2,3);
        assertEquals(3, t1.getSecond());

        Time t2 = new Time(24,60,60);
        assertEquals(0,t2.getSecond());

        Time t3 = new Time(3,3,766);
        assertEquals(-1,t3.getSecond());
    }

    @Test
    void setHour() {
        //Error
        int nuevaHora = 24;
        Time t1 = new Time(1,2,3);
        t1.setHour(nuevaHora);
        assertEquals(0,t1.getHour());
        //Valido
        int nuevaHora2 = 13;
        t1.setHour(nuevaHora2);
        assertEquals(13,t1.getHour());
    }

    @Test
    void setMinute() {
        int nuevoMinuto = 60;
        Time t1 = new Time(1,2,3);
        t1.setMinute(nuevoMinuto);
        assertEquals(0,t1.getMinute());

        int nuevoMinuto2 = 34;
        t1.setMinute(nuevoMinuto2);
        assertEquals(34,t1.getMinute());
    }

    @Test
    void setSecond() {
        int nuevoSegundo = 60;
        Time t1 = new Time(1,2,3);
        t1.setSecond(nuevoSegundo);
        assertEquals(0,t1.getSecond());

        int nuevoSegundo2 = 34;
        t1.setSecond(nuevoSegundo2);
        assertEquals(34,t1.getSecond());
    }

    @Test
    void setTime() {
        Time t4 = new Time(1,2,3);
        int hora = 2;
        int minuto = 3;
        int segundo = 4;
        t4.setTime(hora,minuto,segundo);

        assertEquals(2,t4.getHour());
        assertEquals(3,t4.getMinute());
        assertEquals(4,t4.getSecond());

        Time t5 = new Time(1,2,3);
        t5.setTime(44,333,345);
        assertEquals(-1,t5.getHour());
        assertEquals(-1,t5.getMinute());
        assertEquals(-1,t5.getSecond());
    }

    @Test
    void testToString() {
        Time t5 = new Time(3,4,5);
        String esperado = "3:4:5";
        String supuesto = t5.toString();
        assertEquals(esperado, supuesto);
    }

    @Test
    void nextSecond() {
        Time t1 = new Time(1,2,3);
        Time t2 = new Time(23,59,59);
        int secesp = 4;
        int secesp2 = 0;
        assertEquals(secesp,t1.nextSecond().getSecond());
        assertEquals(secesp2,t2.nextSecond().getSecond());
        assertEquals(00,t2.getHour());
    }

    @Test
    void previousSecond() {
        Time t1 = new Time(1,2,3);
        Time t2 = new Time(00,00,00);
        Time t3 = new Time(23,00,00);
        int secesp = 2;
        int secesp2 = 59;
        int h1 = 1;
        int h2 = 23;
        int h3 = 22;

        t1.previousSecond();
        assertEquals(secesp, t1.getSecond());
        assertEquals(h1, t1.getHour());

        t2.previousSecond();
        assertEquals(secesp2,t2.getSecond());
        assertEquals(h2,t2.getHour());

        t3.previousSecond();
        assertEquals(secesp2, t3.getSecond());
        assertEquals(h3, t3.getHour());

    }

}