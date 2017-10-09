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
        String thechoice = theirdecision.nextLine();
        System.out.print("You entered " + thechoice);
        System.out.flush();
        delay(100);
        System.out.println(" let's begin ");
        System.out.println(".");
        delay(500);
        System.out.println(".");
        delay(500);
        System.out.println(".");
        delay(500);
    }
    public class Grid
    {
        private int[][] Grid = new int[3][3];

        public Grid()
        {
            wipegrid();
        }

        public void wipegrid()
        {
            for(int line=0 ; line<3 ; line++)
                for(int column=0 ; column<3 ; column++)
                    Grid[line][column]=0;
        }
    }




}
