class Parent {
    Parent() {
        System.out.println("Parent");
    }

    public void Greet() {
        System.out.println("Hi");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child");
    }

    public void Greet() {
        super.Greet();
    }
}

public class Inheritance extends Child {
    Inheritance() {
        Greet();
    }

    public static void main(String[] args) {
        new Inheritance();
    }
}
