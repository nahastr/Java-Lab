import java.util.Scanner;

class Details
{
	int eNo = 0;
	String eName = null;
	int eSalary = 0;
	
	Details(int no, String name, int salary)
	{
		eNo = no;
		eName = name;
		eSalary = salary;
	}
	
	void display()
	{
		System.out.println("\nEmployee no : " + eNo + " Name : " + eName + " Salary : " + eSalary + "\n");
	}

}

class Employee
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the number of Employees : ");
		int n = in.nextInt();
		
		Details [] emp = new Details[n];
		
		int no = 0;
		String name = null;
		int salary = 0;
		
		for(int i = 0; i < n; ++i)
		{
			System.out.print("Enter the employee number : ");
			no = in.nextInt();
			System.out.print("Enter the employee name : ");
			name = st.nextLine();
			System.out.print("Enter the employee salary : ");
			salary = in.nextInt();
			emp[i] = new Details(no, name, salary);
		}
		
		System.out.println("Enter the empolyee number to be searched : ");
		int num = in.nextInt();
		
		for(int i = 0; i < n; ++i)
		{
			if(emp[i].eNo == num)
				emp[num].display();
			else
				System.out.println("Employee dosen't exist ");
		}
		
		for(int i = 0; i < n; ++i)
			emp[i].display();
		
	}
}
