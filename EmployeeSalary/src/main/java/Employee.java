public class Employee {
        public float salary;
        public  float hours;

        public Employee(float salary, float hours) {
        this.salary = salary;
        this.hours = hours;
        }

        public float computeBaseSalary() {
            salary =  (salary * hours * 20);
              return salary;
        }

        public void getInfo(float salary, float hours) {
            System.out.println("Salary has been defined as " + salary);
            System.out.println("Working hours has been defined as " + hours);

        }

        public float AddSal() {
            if (salary < 500) {
                salary += 10;
            }
            return salary;
        }

        public float AddWork() {
            if (hours > 6) {
                salary += 5 * 20 ;
            }
            return salary;
        }
}

