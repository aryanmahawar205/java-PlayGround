import java.util.Scanner;

class NegativeRadiusException extends Exception
{
    @Override
    public String toString()
    {
        return "Radius cannot be negative";
    }
}

public class ThrowAndThrowsAnotherExample
{
    public static double area(int radius) throws NegativeRadiusException
    {
        if (radius < 0)
        {
            throw new NegativeRadiusException();
        }

        return Math.PI*radius*radius;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the radius - "); int rad = sc.nextInt();
        try
        {
            double ar = area(rad);
            System.out.println("Area is - " + ar);
        }

        catch(Exception e)
        {
            System.out.println(e + " exception has occurred");
        }
    }
}