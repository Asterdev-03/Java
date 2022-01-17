import java.util.Scanner;

class Box {
    int length;
    int width;
    int height;

    Box(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    int volume() {
        return length * width * height;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        int length, width, height, volume;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dimensions:");
        length = sc.nextInt();
        width = sc.nextInt();
        height = sc.nextInt();

        Box myBox = new Box(length, width, height);

        volume = myBox.volume();

        System.out.println("Volume: " + volume);
    }
}