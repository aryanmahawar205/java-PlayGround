// the throw keyword is used to throw an exception explicitly by the programmer

import java.util.Scanner;

class MyExceptionClass extends Exception
{
    @Override
    public String toString()
    {
        return "I am toString()";
    }

    @Override
    public String getMessage()
    {
        return "I am getMessage()";
    }
}

public class ExceptionClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a - "); int a = sc.nextInt();

        if (a<9)
        {
            try
            {
                throw new MyExceptionClass();
            }

            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e); // by default overridden toString() is called
            }
        }
    }
}