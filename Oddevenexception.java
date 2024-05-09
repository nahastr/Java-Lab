import java.util.Scanner;

class Oddexception extends Exception
{
    Oddexception(String s)
    {
        super(s);
    }
}

class Evenexception extends Exception
{
    Evenexception(String s)
    {
        super(s);
    }
}

class Oddeven
{
    void Oddevenx(int x) throws Oddexception, Evenexception
    {
        if(x%2==0)
            throw new Evenexception("Even");
        else 
            throw new Oddexception("Odd");
    }
}

class Oddevenexception
{
    public static void main(String args[])
    {
        Oddeven o = new Oddeven();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = in.nextInt();
        try
        {
            o.Oddevenx(n);
        }
        catch(Evenexception e)
        {
            System.out.println(e);
        }
        catch(Oddexception e)
        {
            System.out.println(e);
        }
    }
}    
