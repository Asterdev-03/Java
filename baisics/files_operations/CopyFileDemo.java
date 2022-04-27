import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("output.txt");
            String s;
            while ((s = br.readLine()) != null) { 
                fw.write(s); 
                fw.flush();
            }
            br.close();
            fw.close();
            System.out.println("file copied");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}