package Streams.BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;

public class Main
{
    public static void main(String[] args)
    {
        // byte to char stream and then reading char stream
        try
        {
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("You typed: " + br.readLine());
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

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