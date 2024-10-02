import java.util.Scanner;

public class NestedTryCatchBlock
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];
        array[0] = 10; array[1] = 20; array[2] = 30;

        System.out.printf("Enter the index - "); int index = sc.nextInt();

        try
        {
            try
            {
                System.out.println("The array value at index - " + index + " is - " + array[index]);
            }

            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array out of bounds exception occurred");
                System.out.println("Exception at level 2");
            }
        }

        catch(Exception e)
        {
            System.out.println("Some exception in level 1");
        }
    }
}