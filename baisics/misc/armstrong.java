import java.util.Scanner;
public class Armstrong
{
	public static void main(String s[])
	{
		int n, dig, copyn, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3-digit number: ");
		n = sc.nextInt();
		copyn = n;
		while(n != 0)
		{
			dig = n % 10;
			sum = sum + (dig * dig * dig);
			n = n/10;
		}
		if(sum == copyn)
			System.out.println(copyn + " is an Armstrong number");
		else
			System.out.println(copyn + " is not an Armstrong number");
	}
}
