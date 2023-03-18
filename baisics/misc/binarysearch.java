import java.util.Scanner;
public class BinarySearch
{
	public static void main(String s[])
	{
		int n, i, mid, beg, end, item, pos = -1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements into array in ascending order: ");
		for(i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.print("Enter item to be searched for: ");
		item = sc.nextInt();
		beg = 0;
		end = n-1;
		while(beg <= end)
		{
			mid = (beg + end)/2;
			if(a[mid] == item)
			{
				pos = mid + 1;
				break;
			}
			else if(a[mid] > item)
				end = mid - 1;
			else
				beg = mid + 1;
		}
		if(pos == -1)
			System.out.print(item + " not found");
		else
			System.out.print(item + " found at position " + pos);
	}
}
