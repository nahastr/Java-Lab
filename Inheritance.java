import java.util.Scanner;

class Person 
{
	String name;
	String gender;
	String address;
	int age;

	Person(String name, String gender, String address, int age)
	{
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
}

class Employee extends Person
{
	int emid;
	String company_name;
	String qualification;
	int salary;
	
	Employee(String name, String gender, String address, int age, int emid, String company_name, String qualification, int salary)
	{
		super(name, gender, address, age);
		this.emid = emid;
		this.company_name = company_name;
		this.qualification = qualification;
		this.salary = salary;
	}
}

class Teacher extends Employee
{
	String subject;
	String department;
	int teacherid;
	
	Teacher(String name, String gender, String address, int age, int emid, String company_name, String qualification, int salary ,String subject, String department, int teacherid)
	{
		super(name, gender, address, age, emid, company_name, qualification, salary);
		this.subject = subject;
		this.department = department;
		this.teacherid = teacherid;
	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(gender);
		System.out.println(address);
		System.out.println(age);
		System.out.println(emid);
		System.out.println(company_name);
		System.out.println(qualification);
		System.out.println(salary);
		System.out.println(subject);
		System.out.println(department);
		System.out.println(teacherid);
	}
}

class Inheritance
{
	public static void main(String args[])
	{
		//Scanner in = new Scanner(System.in);
		//Scanner st = new Scanner(System.in);
		
		//System.out.println("Enter the number of Teachers ");
		//int n = in.nextInt();
		
		
		/*for(int i = 0; i < n; ++i)
		{
			System.out.println("Enter the employee id :");		
		}*/
		Teacher[] t = new Teacher[2];
		
		t[0] = new Teacher("Nahas", "Male", "jkl Road",24 ,100, "ABC", "MCA", 20000, "java", "C S", 1000);
		t[1] = new Teacher("Lijith", "Male", "Enaty",22 , 103, "ABC", "B-tech", 25000, "C++", "C S", 1005);
		
		t[0].display();
		
	}
}
