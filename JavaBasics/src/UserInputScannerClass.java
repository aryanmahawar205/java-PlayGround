import java.util.Scanner;

public class UserInputScannerClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number - ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number - ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.print("The sum of "+num1+" and "+num2+" is - "+sum);

        System.out.println();
        System.out.println();

        // some useful Scanner class functions
        // to check if the user has entered an integer or not we can use .hasNextInt() function
        System.out.print("Enter an integer only - ");
        boolean isInt = sc.hasNextInt();
        // true if user has entered integer else false
        System.out.println(isInt);
        System.out.println();

        sc.next(); // clear input buffer stream

        // to take strings an input use these Scanner class functions
        // for a single word, truncate everything after space use .next() function
        // for multiword sentences, use .nextLine() function
        System.out.print("Enter a string - (we will display only the first word below) - ");
        String oneWord = sc.next();
        System.out.println(oneWord);

        sc.next(); // clear input buffer stream

        System.out.print("Enter a string - (we will display the whole string below) - ");
        String fullSentence = sc.nextLine();
        System.out.print(fullSentence);
    }
}