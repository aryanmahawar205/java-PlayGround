package ReaderStreams.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("D:\\java-PlayGround\\JavaFileHandling\\src\\Streams\\FileReader\\note.txt");
            int letters;

            while ((letters = fr.read()) != -1)
            {
                System.out.println((char) letters);
            }

            fr.close();
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}