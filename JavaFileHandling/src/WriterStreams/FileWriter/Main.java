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

        // TO APPEND AND NOT ERASE ENTIRE FILE CONTENT AND THE OVERWRITE IT, ADD TRUE AS SHOWN BELOW WHILE CREATING THE FILEWRITER OBJECT
//        try
//        {
//            FileWriter fw = new FileWriter("D:\\java-PlayGround\\JavaFileHandling\\src\\WriterStreams\\FileWriter\\new.txt", true);
//            fw.write("Hey there!");
//
//            fw.flush();
//        }
//
//        catch(IOException e)
//        {
//            System.out.println(e.getMessage());
//        }
    }
}
