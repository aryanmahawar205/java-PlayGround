import java.util.Scanner;

public class SpecificExceptions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];
        array[0] = 20; array[1] = 30; array[2] = 40;

        System.out.printf("Enter the array index whose value you wish to divide by - ");
        int index = sc.nextInt();

        System.out.printf("Enter the value by which you want to divide - ");
        int number = sc.nextInt();

        try
        {
            System.out.println("The result of division is - " + array[index]/number);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bounds exception occurred");
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception occurred");
        }

        catch(Exception e)
        {
            System.out.println("Some other exception occureed - " + e);
        }
    }
}