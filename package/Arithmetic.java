package Arithmetic_operations;

interface Operations
{
	int addition(int x, int y);
	int substraction(int x,  int y);
	float division(float x, float y);
	int multiplication(int x, int y);
}

public class Arithmetic implements Operations
{
	public int addition(int x, int y)
	{
		return x+y;	
	}
	
	public int substraction(int x,  int y)
	{
		return x-y;	
	}
	
	public float division(float x, float y)
	{
		return x/y;
	}
	
	public int multiplication(int x, int y)
	{
		return x*y;
	}
}
