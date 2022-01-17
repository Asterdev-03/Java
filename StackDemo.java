import java.util.Scanner;

class Stack {
    int arr[];
    int top;
    int size;

    Stack(int length) {
        arr = new int[length];
        size = length;
        top = -1; 
    }

    void push(int x) {
        if(isFull()) {
            System.out.println("Overflow");
            System.exit(-1);
        }
        System.out.println("Inserted " + x);
        arr[++top] = x;
    }

    int pop() {
        if(isEmpty()) {
            System.out.println("Underflow");
            System.exit(-1);            
        }
        System.out.println("Poped " + peek());
        return arr[top--];
    }
    int peek() {
        if(!isEmpty())
            return arr[top];
        else
            System.exit(-1);
        return -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

}

public class StackDemo {
    public static void main(String[] args) {
        int size, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of stack:");
        size = sc.nextInt();

        Stack myStack = new Stack(size);

        System.out.print("Enter no. to be pushed: ");
        num = sc.nextInt();
        myStack.push(num);

        System.out.print("Enter no. to be pushed: ");
        num = sc.nextInt();
        myStack.push(num);

        myStack.pop();

        System.out.print("Enter no. to be pushed: ");
        num = sc.nextInt();
        myStack.push(num);

        System.out.println("Top Element: " + myStack.peek());
    }
}
