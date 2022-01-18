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
            return;
        }
        System.out.println("Inserted " + x);
        arr[++top] = x;
    }

    void pop() {
        if(isEmpty()) {
            System.out.println("Underflow");
            return;          
        }
        System.out.println("Poped " + arr[top--]);
    }

    int peek() {
        if(isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top];
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
        int size, num, choice;
        boolean status = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of stack:");
        size = sc.nextInt();

        Stack myStack = new Stack(size);

        while(status) {
            System.out.println("1.Push \n2.Pop \n3.Peek \n4.Exit");
            System.out.println("Enter choice:");
            choice = sc.nextInt();
            
            switch(choice) {
                case 1: 
                        System.out.print("Enter no. to be pushed: ");
                        num = sc.nextInt();
                        myStack.push(num);
                        break;
                case 2: 
                        myStack.pop();
                        break;
                case 3: 
                        System.out.println("Top Element: " + myStack.peek());
                        break;
                case 4: 
                        status = false;;
                        break;
                default: status = false;
            }
        }
    }
}
