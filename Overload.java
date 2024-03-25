import java.util.Scanner;

class Shapes
{
	void area(int l, int b)
	{
		System.out.println("Area of rectangle is " + l * b);
	}
	
	void area(float r)
	{
		System.out.println("Area of circle is " + 3.14 * r * r);
	}
	
	void area(int s)
	{
		System.out.println("Area of square is " + s * s);
	}
}

class Overload
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		Shapes rectangle = new Shapes();
		Shapes circle = new Shapes();
		Shapes square = new Shapes();
		
		System.out.println("Enter the length and breadth ");
		int l = in.nextInt();
		int b = in.nextInt();	
		rectangle.area(l, b);
		
		System.out.println("Enter the radius ");
		float r = in.nextFloat();
		circle.area(r);
		
		System.out.println("Enter the side ");
		int s = in.nextInt();
		square.area(s);	
	}
}
