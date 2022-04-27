public class Employee {
    protected String name;
    protected int age;
    protected int phno;
    protected double salary;
    protected String address;

    public void printSalary() {
        System.out.println("\nSalary: " + salary);
    }

    public void printInfo() {
        System.out.println("\n---- Employee Details ----");
        System.out.println("-> Name : " + name);
        System.out.println("-> Age : " + age);
        System.out.println("-> Phone Number : " + phno);
        System.out.println("-> Salary : " + salary);
        System.out.println("-> Address : " + address);
    }

    public static void main(String[] args) {
        System.out.println("\n----- XYZ Company Employee List -----");
        Officer officer1 = new Officer("Edwin", 25, 618452462, 32495.5, "Kerala", "HR");
        officer1.printSalary();
        officer1.printSpec();

        Manager manager1 = new Manager("Anagha", 22, 896243139, 89324.1, "Bangalore", "Design");
        manager1.printSalary();
        manager1.printDep();
    }
}

class Officer extends Employee {
    private String spec;

    Officer(String name, int age, int phno, double salary, String address) {
        this.name = name;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
        this.address = address;

        this.printInfo();
    }

    Officer(String name, int age, int phno, double salary, String address, String spec) {
        this.name = name;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
        this.address = address;
        this.spec = spec;

        this.printInfo();
        this.printSpec();
    }

    public void printSpec() {
        System.out.println("Specialization : " + spec);
    }
}

class Manager extends Employee {
    private String dep;

    Manager(String name, int age, int phno, double salary, String address) {
        this.name = name;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
        this.address = address;

        this.printInfo();
    }

    Manager(String name, int age, int phno, double salary, String address, String dep) {
        this.name = name;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
        this.address = address;
        this.dep = dep;

        this.printInfo();
        this.printDep();
    }

    public void printDep() {
        System.out.println("Department : " + dep);
    }
}