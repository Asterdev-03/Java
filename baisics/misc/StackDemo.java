// Implementation of Basic Stack Operations using Array

import java.util.Scanner;

// Declaration of class Stack
class Stack {
    int arr[];
    int top;
    int size;

    // Initializing instance variables
    Stack(int length) {
        arr = new int[length];
        size = length;
        top = -1;
    }

    // Pushes value to top of the Stack
    void push(int x) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        System.out.println("Inserted " + x);
        arr[++top] = x;
    }

    // Pops value at the top
    void pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        System.out.println("Poped " + arr[top--]);
    }

    // Peeks at the top value
    void peek() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        System.out.println("Top Element " + arr[top]);
    }

    // Checks is stack empty
    boolean isEmpty() {
        return top == -1;
    }

    // Checks is stack full
    boolean isFull() {
        return top == size - 1;
    }

}

public class StackDemo {
    public static void main(String[] args) {
        int size, num, choice;
        boolean status = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of stack:");
        size = sc.nextInt();

        Stack myStack = new Stack(size);

        while (status) {
            System.out.println("1.Push \n2.Pop \n3.Peek \n4.Exit");
            System.out.println("Enter choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter no. to be pushed: ");
                    num = sc.nextInt();
                    myStack.push(num);
                    break;
                case 2:
                    myStack.pop();
                    break;
                case 3:
                    myStack.peek();
                    break;
                case 4:
                    status = false;
                    break;
                default:
                    status = false;
            }
        }
    }
}
