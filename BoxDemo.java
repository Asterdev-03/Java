// A simple Multi Class Example

import java.util.Scanner;

// Declaration of class Box
class Box {
    int length;
    int width;
    int height;

    // Initializing the dimensions of the Box object
    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Returning the volume of the Box object
    int volume() {
        return length * width * height;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        int length, width, height, volume;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        length = sc.nextInt();
        System.out.print("Enter Width: ");
        width = sc.nextInt();
        System.out.print("Enter Heigth: ");
        height = sc.nextInt();

        Box myBox = new Box(length, width, height);

        volume = myBox.volume();

        System.out.println("Volume of the Box: " + volume);
    }
}