import java.util.Scanner;

class Matrix
{
	int n = 0;
	Scanner in = new Scanner(System.in);
	int arr[][];
	boolean flag = false;
	Matrix(int n)
	{
		this.n = n;
		arr = new int[n][n];
	}
	
	void createMatrix()
	{
		System.out.println("Enter the values of the matrix : ");
		for(int i = 0; i < n; ++i)
			for(int j = 0; j < n; ++j)
			{
				arr[i][j] = in.nextInt();
			}
	}
	
	void displayMatrix()
	{
		for(int i = 0; i < n; ++i)
		{
			for(int j = 0; j < n; ++j)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	
	void isSymmetric()
	{
		for(int i = 0; i < n ; ++i)
		{
			for(int j = 0; j < n; ++j)
			{
				if( arr[i][j] != arr[j][i] ) 
				{	flag = true;
					break;
				}
			}
			if (flag == true)
				break;
		}
		
		if(!flag)
			System.out.println("Its symmetric..");
		else
			System.out.println("Its not symmetric...");
	}
}

class Symmetric
{
	public static void main(String args[])
	{
		System.out.println("Enter the size of matrix : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Matrix m = new Matrix(n);
		
		m.createMatrix();
		System.out.println();
		m.displayMatrix();
		
		m.isSymmetric();
		
	}
	
	
}
