class Cpu
{
	
	int price = 70000;
	/*void display()
	{
		System.out.println("Price : " + price );
		Processor p = new Processor();
		p.display();
	}*/

	class Processor
	{
		int core = 16;
		String name = "Intel";
		void display()
		{
			System.out.println("Price : " + price );
			System.out.println("Core : " + core );
			System.out.println("Brand : " + name );
		}
	}
	
	static class Ram
	{
		int size = 16;
		String name = "Adata";
		void display()
		{
			System.out.println("Size : " + size );
			System.out.println("Brand : " + name );
		}
	}
}


class Innerclass
{
	public static void main(String args[])
	{
		Cpu c = new Cpu();
		Cpu.Processor p = c.new Processor();
		p.display();
		Cpu.Ram r = new Cpu.Ram();
		r.display();
	}
}
