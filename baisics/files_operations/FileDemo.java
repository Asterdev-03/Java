import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fin = new FileInputStream("input.txt");
            FileOutputStream fout = new FileOutputStream("output.txt");

            int c;
            do {
                c = fin.read();
                if (c != -1)
                    fout.write((char) c);
            } while (c != -1);

            System.out.println("File Copied");
        } catch (FileNotFoundException e) {
            System.out.println("Exception Found : " + e);
        }
    }
}
