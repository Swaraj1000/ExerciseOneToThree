public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee(12,7);
        System.out.println(emp.computeBaseSalary());
        System.out.println(emp.AddSal());
        System.out.println(emp.AddWork());
        emp.getInfo(12,7);
    }

}