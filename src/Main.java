import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        String fileName = "two.text";
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(new FileOutputStream(fileName, true));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found: " +fileName);
            System.exit(0);
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter three lines for this file");
        for(int i = 0; i<3; i++)
        {
            String line = keyboard.nextLine();
            outputStream.println(i + " " + line);
        }
        outputStream.close();
        System.out.println("these lines are added to the file: "+ fileName);

    }
}
