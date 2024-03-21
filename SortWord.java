import java.util.Scanner;
import java.util.Arrays;

class SortString
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter the number of strings : ");
		n = in.nextInt();
		
		String str[] = new String[n];
		
		System.out.println("Enter the stings :");
		for(int i = 0; i < n; ++i)
			str[i] = sc.nextLine();
			
		Arrays.sort(str);
		
		System.out.println("Sorted elements are :");
		for(int i = 0; i < n; ++i)
			System.out.println(str[i]);
	}
}	
