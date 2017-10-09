package OX;
import java.util.Scanner;

public class Main
{
    public static void delay(int millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException exp)
        {
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, Welcome to 'Noughts&Crosses - The Game'");
        delay(500);
        Scanner theirdecision = new Scanner(System.in);
        System.out.print("To begin, start by selecting your shape. Choose either X or O: ");
        theirdecision.nextLine();
        String thechoice = theirdecision.nextLine();
        System.out.print("You entered " + thechoice);
        delay(100);
        System.out.println("Let's begin ");
        System.out.println(".");
        delay(500);
        System.out.println(".");
        delay(500);
        System.out.println(".");
        delay(500);
    }



}
