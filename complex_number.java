import java.util.Scanner;

class complex
{
	int r, i;
	complex(int r, int i)
	{
		this.r = r;
		this.i = i;
	}
	
	/*void display()
	{
		System.out.println(r + " " + i);
	}*/
}

class complex_number
{
	public static void main(String args[])
	{
			
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the real : ");
		int r = in.nextInt();
		System.out.print("Enter the image : ");
		int i = in.nextInt();
		
		complex c1 = new complex(r, i);
		
		System.out.print("Enter the real : ");
		r = in.nextInt();
		System.out.print("Enter the image : ");
		i = in.nextInt();
		
		complex c2 = new complex(r, i);
		
		int real = c1.r + c2.r;
		int image = c1.i + c2.i;
		
		System.out.println("Complex number : " + real + " + " + image +"i");
	}
}
