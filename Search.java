import java.util.Scanner;

class Search
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = in.nextInt();
		int [] arr = new int[n];
		
		
		System.out.println("Enter the Elements: ");
		for(int i = 0; i < n; ++i)
		{
			arr[i] = in.nextInt();
		}
		
		System.out.println("Enter the element to be searched : ");
		int s = in.nextInt();
		
		//Searching 
		boolean flag = false;
		for(int i = 0; i < n; ++i)
		{
			if(arr[i] == s)
			{
				flag = true;
				break;
			}
		}
		
		if(flag)
			System.out.println("Element is present in array ");
		else
			System.out.println("Element is not in array ");	
	}
}
