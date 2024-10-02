import java.util.Scanner;

public class TryCatchBlock
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 6000;
        System.out.printf("Enter the value of b - ");
        int b = sc.nextInt();

        try
        {
            System.out.println("The result of division of a/b is - " + a/b);
        }

        catch(Exception e)
        {
            System.out.println("Encountered Runtime Exception - " + e);
        }

        System.out.println("Executing rest of code here on...");
    }
}