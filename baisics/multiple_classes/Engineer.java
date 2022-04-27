class Employee {
    protected String className;
    protected double salary = 10000.0;

    public void display(String className) {
        System.out.println("Name of the Class : " + className);
    }

    public void calcSalary(double salary) {
        System.out.println("Salary of Employee : " + salary);
    }
}

public class Engineer extends Employee {
    public void calcSalary(double salary) {
        System.out.println("Salary of Employee : " + salary);
    }

    public void calcSalary() {
        super.calcSalary(salary);
    }

    public static void main(String[] args) {
        Engineer engr = new Engineer();
        engr.display("Employee");
        engr.calcSalary();
        engr.calcSalary(20000.0);
    }
}
