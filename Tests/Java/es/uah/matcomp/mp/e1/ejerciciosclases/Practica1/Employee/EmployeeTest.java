package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Employee;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Rectangle.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        int id = 345785;
        String firstName = "Rosa";
        String lastName = "Mendoza";
        int salary = 1200;
        Employee employee = new Employee(id,firstName,lastName,salary);
        assertEquals(id,employee.getId());
    }

    @Test
    void getFirstName() {
        int id = 345785;
        String firstName = "Rosa";
        String lastName = "Mendoza";
        int salary = 1200;
        Employee employee = new Employee(id,firstName,lastName,salary);
        assertEquals(firstName,employee.getFirstName());
    }


    @Test
    void getLastName() {
        int id = 345785;
        String firstName = "Rosa";
        String lastName = "Mendoza";
        int salary = 1200;
        Employee employee = new Employee(id,firstName,lastName,salary);
        assertEquals(lastName,employee.getLastName());
    }

    @Test
    void getName() {
        int id = 345785;
        String firstName = "Rosa";
        String lastName = "Mendoza";
        int salary = 1200;
        Employee employee = new Employee(id,firstName,lastName,salary);
        String Name = firstName + lastName;
        assertEquals(Name,employee.getName());
    }

    @Test
    void getSalary() {
        int id = 345785;
        String firstName = "Rosa";
        String lastName = "Mendoza";
        int salary = 1200;
        Employee employee = new Employee(id,firstName,lastName,salary);
        assertEquals(salary,employee.getSalary());
    }

    @Test
    void getAnnualSalary() {
        int id = 345785;
        String firstName = "Rosa";
        String lastName = "Mendoza";
        int salary = 1200;
        Employee employee = new Employee(id,firstName,lastName,salary);
        int annualSalaryEsperado = salary * 12;
        assertEquals(annualSalaryEsperado,employee.getAnnualSalary());
    }

    @Test
    void setSalary() {
        int id = 345785;
        String firstName = "Rosa";
        String lastName = "Mendoza";
        int salary = 1200;
        Employee employee = new Employee(id,firstName,lastName,salary);
        int nuevoSalary = 1300;
        employee.setSalary(nuevoSalary);
        assertEquals(nuevoSalary,employee.getSalary());
    }

    @Test
    void raiseSalary() {
        int id = 345785;
        String firstName = "Rosa";
        String lastName = "Mendoza";
        int salary = 1200;
        Employee employee = new Employee(id,firstName,lastName,salary);
        int percent = 20;
        int salaryEsperado = salary + (salary * percent)/100;
        assertEquals(salaryEsperado, employee.raiseSalary(percent));

    }

    @Test
    void testToString() {
        int id = 345785;
        String firstName = "Rosa";
        String lastName = "Mendoza";
        int salary = 1200;
        Employee employee = new Employee(id,firstName,lastName,salary);
        assertEquals("Employee[id = 345785, name = Rosa Mendoza, salary = 1200]", employee.toString());
    }
}