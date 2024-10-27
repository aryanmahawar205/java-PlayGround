package WriterStreams.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java-PlayGround\\JavaFileHandling\\src\\WriterStreams\\BufferedWriter\\buff.txt"));
            bw.write("Hola Amigo, Gracias!");

            bw.flush();
        }

        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}