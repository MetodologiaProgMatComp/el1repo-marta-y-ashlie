package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.Personysubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        String program = "Economia";
        int year =2;
        double fee = 400;
        Student student = new Student("Maria"," Las Rosas 1", program,year,fee);
        assertEquals(program,student.getProgram());

    }
    @Test
    void getYear() {
        String program = "Economia";
        int year =2;
        double fee = 400;
        Student student = new Student("Maria"," Las Rosas 1", program,year,fee);
        assertEquals(year,student.getYear());

    }

    @Test
    void getFee() {
        String program = "Matematicas";
        int year =2;
        double fee = 400;
        Student student = new Student("Maria"," Las Rosas 1", program,year,fee);
        assertEquals(fee,student.getFee());

    }

    @Test
    void setProgram() {
        String program = "Informatica";
        int year =2;
        double fee = 400;
        Student student = new Student("Maria"," Las Rosas 1", program,year,fee);
        String newProgram = "Medicina";
        student.setProgram(newProgram);
        assertEquals(newProgram,student.getProgram());

    }

    @Test
    void setYear() {
        String program = "Medicina";
        int year =2;
        double fee = 400;
        Student student = new Student("Maria"," Las Rosas 1", program,year,fee);
        int newYear = 3;
        student.setYear(newYear);
        assertEquals(newYear,student.getYear());

    }

    @Test
    void setFee() {
        String program = "Enfermeria";
        int year =2;
        double fee = 400;
        Student student = new Student("Maria"," Las Rosas 1", program,year,fee);
        double newFee = 500;
        student.setFee(newFee);
        assertEquals(newFee,student.getFee());

    }

    @Test
    void testToString() {
        String program = "Medicina";
        int year =2;
        double fee = 400;
        Student student = new Student("Maria"," Las Rosas 1", program,year,fee);
        assertEquals("Student [Person[name = Maria, address =  Las Rosas 1]], program = Medicina,year = 2, fee = 400.0]",student.toString());

    }
}