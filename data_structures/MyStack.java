import java.util.Stack;

public class MyStack {
    public static void main(String args[]) {
        Stack s = new Stack();
        System.out.println("content of s=" + s); // []
        System.out.println("size of s=" + s.size()); // 0
        System.out.println("Is empty?" + s.empty()); // true
        // add the data to s
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("content of s=" + s); // [10,20,30,40]
        System.out.println("size of s=" + s.size()); // 4
        System.out.println("Is s empty ?" + s.empty()); // false
        // remove the top most element
        System.out.println("delete element=" + s.pop()); // 40
        System.out.println("content of s after pop=" + s);// [10,20,30]
        // extract the top most element
        System.out.println("top most element=" + s.peek()); // 30
        System.out.println("content of s after peek=" + s); // [10 20 30]
        // Search the element 10 and 100
        System.out.println("stack relative pos.of 10 is=" + s.search(10)); // 3
        System.out.println("stack relative pos.of 100 is=" + s.search(100)); // -1
    }
}