import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int num, flag = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            num = sc.nextInt();
        }
        if(num <= 1)
            flag = 1;
        else
            for(int i=2; i <= num/2; i++)
                if(num%2 == 0){
                    flag = 1;
                    break;
                }
        if(flag == 0)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
