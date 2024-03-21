import java.util.Scanner;

class StringMan
{
	public static void main(String args[])
	{
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = st.nextLine();
		
		//Upper case
		System.out.println("Uppercase : " + str.toUpperCase());
		//Lower Case
		System.out.println("Lowercase : " + str.toLowerCase());
		
		System.out.println("Trim : " + str.trim());
		
		System.out.println("Replace : " + str.replace(str.charAt(0), 'Z'));	
		
		System.out.println("Length : " + str.length());	
	}

}
