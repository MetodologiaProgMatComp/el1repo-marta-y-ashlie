package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Personysubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        String school = "Santa Sofia";
        double pay = 300;
        Staff staff = new Staff("Camila", "Las Rosas", school,pay);
        assertEquals(school, staff.getSchool());

    }

    @Test
    void getPay() {
        String school = "Santa Sofia";
        double pay = 300;
        Staff staff = new Staff("Camila", "Las Rosas", school,pay);
        assertEquals(pay, staff.getPay());

    }

    @Test
    void setSchool() {
        String school = "Santa Sofia";
        double pay = 300;
        Staff staff = new Staff("Camila", "Las Rosas", school,pay);
        String newSchool = "Santa Lucia";
        staff.setSchool(newSchool);
        assertEquals(newSchool, staff.getSchool());
    }

    @Test
    void setPay() {
        String school = "Santa Sofia";
        double pay = 300;
        Staff staff = new Staff("Camila", "Las Rosas", school,pay);
        double newPay = 400;
        staff.setPay(newPay);
        assertEquals(newPay, staff.getPay());
    }

    @Test
    void testToString() {
        String school = "Santa Sofia";
        double pay = 300;
        Staff staff = new Staff("Camila", "Las Rosas", school,pay);
        assertEquals("Staff[Person[name = Camila, address = Las Rosas], school = Santa Sofia,pay = 300.0]", staff.toString());
    }


}