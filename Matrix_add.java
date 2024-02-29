import java.util.Scanner;

class Matrix_add
{
	public static void main(String args[])
	{
		
		System.out.println("Enter the size of matrix ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		int c[][] = new int[n][n];
		
		System.out.println("Enter the elements : ");
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
			{
				System.out.println("Enter the element for first array : ");
				a[i][j] = in.nextInt();
				System.out.println("Enter the element for Second array : ");
				b[i][j] = in.nextInt();
				c[i][j] = a[i][j] + b[i][j];
			}
	
		System.out.println("Matrix A :");	
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(a[i][j] + "	");
			}
			System.out.print("\n\n");
		}
		
		System.out.println("Matrix B :");	
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(b[i][j] + "	");
			}
			System.out.print("\n\n");
		}
		
		System.out.println("Matrix C :");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(c[i][j] + "	");	
			}
			System.out.print("\n\n");
		}
	}
}

