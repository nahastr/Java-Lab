import java.util.Scanner;

class Employee
{
	int empid;
	String name;
	int salary;
	String address;
	Employee(int empid, String name, int salary, String address)
	{
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
}

class Teacher extends Employee
{
	String department;
	String subject;
	Teacher(int empid, String name, int salary, String address, String department, String subject)
	{
		super(empid, name, salary, address);
		this.department = department;
		this.subject = subject;
	}
}

class SimpleInheritance
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of teachers ");
		int n = in.nextInt();
		
		Teacher[] t = new Teacher[n];
		
		for(int i = 0; i < n; ++i)
		{
			System.out.println("\nEnter the Employee ID");
			int empid = in.nextInt();
			in.nextLine();
			System.out.println("Enter the Name ");
			String name = in.nextLine();
			System.out.println("Enter the Salary : ");
			int salary = in.nextInt();
			in.nextLine();
			System.out.println("Enter the address : ");
			String address = in.nextLine();	
			System.out.println("Enter the Department : ");
			String department = in.nextLine();
			System.out.println("Enter the Subject : ");
			String subject = in.nextLine();
					
			t[i] = new Teacher(empid, name, salary, address, department, subject);
		}
		
		System.out.println("Enter the empid ");
		int search = in.nextInt();
		
		boolean flag = false;
		int i;
		for(i = 0; i < n; ++i)
		{
			if(t[i].empid == search)
			{
				flag = true;
				break;
			}	
		}
		
		if(flag)
		{
			System.out.println("\nEmployee Exist..");
			System.out.println("Empid : "+ t[i].empid + "\nName : " + t[i].name + "\nSalary : " + t[i].salary + "\nAddress : "+ t[i].address + "\nDepartment : " + t[i].department + "\nSubject :" + t[i].subject);
		}
		else
			System.out.println("Employee dosen't exist ");
	}
}
