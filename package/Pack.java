import Arithmetic_operations.Arithmetic;


class Pack
{
	public static void main(String args[])
	{
		Arithmetic A = new Arithmetic();
		System.out.println("Addition " + A.addition(4,6));
		System.out.println("Multiplication " + A.multiplication(4,6));
		System.out.println("Substraction " + A.substraction(4,6));
		System.out.println("Division " + A.division(4,6));
	}
} 
