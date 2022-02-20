import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @org.junit.Test
    public void computeBaseSalary() {
        Employee emp = new Employee(12,7);
        assertEquals(1680,emp.computeBaseSalary(),0);
        System.out.println("Value matches as expected");
    }

    @org.junit.Test
    public void getInfo() {
        Employee emp = new Employee(12,7);
    }

    @org.junit.Test
    public void addSal() {
        Employee emp = new Employee(12,7);
        emp.computeBaseSalary();
        assertEquals(1680,emp.AddSal(),0);
        System.out.println("Value matches as expected");
    }

    @org.junit.Test
    public void addWork() {
        Employee emp = new Employee(12,7);
        emp.computeBaseSalary();
        assertEquals(1780,emp.AddWork(),0);
        System.out.println("Value matches as expected");

    }

}