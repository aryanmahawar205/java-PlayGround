package CreateWriteRead;

import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        // Create a new file
        try
        {
            File fo = new File("D:\\java-PlayGround\\JavaFileHandling\\src\\CreateWriteRead\\java-generated-file.txt");
            fo.createNewFile();
        }

        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }


        // Write into the newly created file
        try
        {
            FileWriter fw = new FileWriter("D:\\java-PlayGround\\JavaFileHandling\\src\\CreateWriteRead\\java-generated-file.txt");
            fw.write("Writing into the created file...");

            fw.flush();
        }

        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

        // Read from the newly created file
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("D:\\java-PlayGround\\JavaFileHandling\\src\\Streams\\BufferedReader\\sentences.txt"));
            System.out.println(br.readLine());
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}