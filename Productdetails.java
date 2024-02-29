import java.util.Scanner;

class Product
{
	String name;
	int code, price;
	Product(String name, int code, int price)
	{
		this.name = name;
		this.code = code;
		this.price = price;
	}
	
	void display()
	{
		System.out.println(code + "		" + name + "			"+ price);
	}
}

class Productdetails
{
	static void lowest(Product p1, Product p2, Product p3)
	{
		if(p1.price < p2.price && p1.price < p3.price)
			System.out.println(p1.name + " has the lowest price " + p1.price);
		else if(p2.price < p1.price && p2.price < p3.price)
			System.out.println(p2.name + " has the lowest price " + p2.price);
		else
			System.out.println(p3.name + " has the lowest price " + p3.price);
	}	
	
	
	public static void main(String args[])
	{
		Product p1 = new Product("Soap", 001, 25);
		Product p2 = new Product("Brush", 002, 10);
		Product p3 = new Product("Paste", 003, 50);
		System.out.println("Product_Code	Product_Name	Product_Price");
		p1.display();
		p2.display();
		p3.display();
		
		lowest(p1, p2, p3);
	}
}
