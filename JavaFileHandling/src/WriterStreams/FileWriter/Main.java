package WriterStreams.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw = new FileWriter("D:\\java-PlayGround\\JavaFileHandling\\src\\WriterStreams\\FileWriter\\new.txt");
            fw.write("Hey there!");

            fw.flush();
        }

        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
