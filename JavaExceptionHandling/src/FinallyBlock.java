// finally block contains the code which is always executed whether the exception is handled or not
// it is used to execute code containing instructions to release the system resources or to close a connection (like a database connection)

public class FinallyBlock
{
    public static int greet()
    {
        try
        {
            int a = 5; int b = 0;
            return a/b;
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

        // will even execute if the function returns in the try block (POWER OF FINALLY BLOCK)
        finally
        {
            System.out.println("End of program...Releasing resources...");
        }

        return -1; // indicating failure, exception occurred
    }

    public static void main(String[] args)
    {
        int a = greet();
        System.out.println(a);
    }
}