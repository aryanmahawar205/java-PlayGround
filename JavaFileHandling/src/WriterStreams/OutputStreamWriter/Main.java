package WriterStreams.OutputStreamWriter;

import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            OutputStreamWriter osw = new OutputStreamWriter((System.out));
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
            // osw.write(😍); range is exceeded for emoji unicode encoding
            osw.write('\n'); // Writes another newline

            osw.flush(); // Ensure all data is written to output
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}