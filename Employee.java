import java.util.Scanner;

class Details {
    int eNo = 0;
    String eName = null;
    int eSalary = 0;

    Details(int no, String name, int salary) {
        eNo = no;
        eName = name;
        eSalary = salary;
    }

    void display() {
        System.out.println(eNo + "      " + eName + "       " + eSalary);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Employees : ");
        int n = in.nextInt();
        in.nextLine();
        Details[] emp = new Details[n];

        int no = 0;
        String name = null;
        int salary = 0;

        for (int i = 0; i < n; ++i) {
            System.out.print("Enter the employee number : ");
            no = in.nextInt();
            in.nextLine();
            System.out.print("Enter the employee name : ");
            name = in.nextLine();
            System.out.print("Enter the employee salary : ");
            salary = in.nextInt();
            emp[i] = new Details(no, name, salary);
        }

        System.out.println("Enter the employee number to be searched : ");
        int num = in.nextInt();
        boolean flag = false;
        int i;
        for (i = 0; i < n; ++i) {
            if (emp[i].eNo == num) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("Employee exists:");
        else
            System.out.println("Employee doesn't exist.");

        emp[i].display();


        System.out.println("Employee id         Name    Salary");
        for (i = 0; i < n; ++i)
            emp[i].display();
    }
}
