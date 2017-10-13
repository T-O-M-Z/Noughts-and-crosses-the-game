package OX;
import java.util.Scanner;
import java.util.Random;
// 1) Display main menu, 2) Get players next move 3) display a grid  4)Result of game - who wins/loses?


public class Main
{
    private final static int GRIDSIZE = 3;
    private static String[][] grid = new String[GRIDSIZE][GRIDSIZE];
    public static void main(String[] args)
    {
        System.out.println("Welcome to Noughts and Crosses");
        for(int r = 0; r < GRIDSIZE; r++)
        {
            for(int c = 0; c < GRIDSIZE; c++)
            {
                grid[r][c] = " ~ ";
            }
        }
        menu();
        while (true)
        {
        Grid();
        PlayersMove();
        Grid();
        if(CheckingBoard(" X ") == true)
        {
            endgame(" X ");
            break;
        }
        AIMove();
        Grid();
        if(CheckingBoard(" O ") == true)
        {
            endgame(" O ");
            break;
        }
        }
    }
    public static void menu()
    {
        System.out.println("Welcome to the menu, please select your shape ");
    }
    public static void Grid()
    {
        for(int r = 0; r < GRIDSIZE; r++)
        {
            for(int c = 0; c < GRIDSIZE; c++)
            {
                System.out.print(grid[r][c]);
            }
            System.out.println("");
        }
        System.out.println("The grid will be shown, and the grid will be wiped");
        //Grid needs creation and wipe
    }
    public static void PlayersMove()
    {
        System.out.println("To make your choice you need to make sure NumLock is turned ON... " +
                " Select where you'd like to place your shape using the numpad i.e. 7 would be 1:1 and 3 would be 3:3");
        Scanner theiranswer = new Scanner(System.in);
        System.out.print("Make your move: ");
        String theirchoice = theiranswer.nextLine();
        System.out.println("Your move was " + theirchoice);
        if(theirchoice.equals("7"))
        {
            if(grid[0][0] == " ~ ")
            {
                grid[0][0] = " X ";
            }
            else
            {
               System.out.println("That space is already taken, select another");
            }

        }
        if(theirchoice.equals("8"))
        {
            if(grid[0][1] == " ~ ")
        {
            grid[0][1] = " X ";
        }
        else
        {
            System.out.println("That space is already taken, select another");
        }
        }
        if(theirchoice.equals("9"))
        {
            if(grid[0][2] == " ~ ")
            {
                grid[0][2] = " X ";
            }
            else
            {
                System.out.println("That space is already taken, select another");
            }

        }
        if(theirchoice.equals("4"))
        {
            if(grid[1][0] == " ~ ")
            {
                grid[1][0] = " X ";
            }
            else
            {
                System.out.println("That space is already taken, select another");
            }

        }
        if(theirchoice.equals("5"))
        {
            if(grid[1][1] == " ~ ")
            {
                grid[1][1] = " X ";
            }
            else
            {
                System.out.println("That space is already taken, select another");
            }

        }
        if(theirchoice.equals("6"))
        {
            if(grid[1][2] == " ~ ")
            {
                grid[1][2] = " X ";
            }
            else
            {
                System.out.println("That space is already taken, select another");
            }

        }
        if(theirchoice.equals("1"))
        {
            if(grid[2][0] == " ~ ")
            {
                grid[2][0] = " X ";
            }
            else
            {
                System.out.println("That space is already taken, select another");
            }

        }
        if(theirchoice.equals(" 2 "))
        {
            if(grid[2][1] == " ~ ")
            {
                grid[2][1] = " X ";
            }
            else
            {
                System.out.println("That space is already taken, select another");
            }

        }
        if(theirchoice.equals("3"))
        {
            if(grid[2][2] == " ~ ")
            {
                grid[2][2] = " X ";
            }
            else
            {
                System.out.println("That space is already taken, select another");
            }

        }


    }
    public static void AIMove()
    {
        System.out.println("The AI needs to make a move based on players choice");
        Random newRand = new Random();
        int choice = newRand.nextInt(6);
        if(choice == 7)
        {
            if(grid[0][0] == " ~ ")
            {
                grid[0][0] = " O ";
            }
            else
            {
                if(grid[0][1] == " ~ ")
                {
                }
            }

        }
    }
    public static boolean result()
    {
        System.out.println("If the game is over then TRUE, if it isn't then FALSE");
        return false;
    }
    public static void endgame(String Shape)
    {
        System.out.println("The result was " + Shape + " won");
    }
    public static boolean ColumnChecking(int TheColumn, String Shape)
    {
        if     (
                grid[0][TheColumn].equals(Shape) &&
                grid[1][TheColumn].equals(Shape) &&
                grid[2][TheColumn].equals(Shape)
                )
        {
            return true;
        }
        return false;
    }
    public static boolean CheckingBoard(String Shape)
    {
        if      (
                        ColumnChecking(0, Shape)||
                        ColumnChecking(1, Shape)||
                        ColumnChecking(2, Shape)||
                        RowChecking(0, Shape)||
                        RowChecking(1, Shape)||
                        RowChecking(2, Shape)
                        DiagonalChecking()
                )
        {
            return true;
        }
        return false;
    }
    public static boolean RowChecking(int TheRow, String Shape)
    {
        if
                (
                grid[TheRow][0].equals(Shape) &&
                grid[TheRow][1].equals(Shape) &&
                grid[TheRow][2].equals(Shape)
                )
        {
            return true;
        }
        return false;
    }
    public static boolean DiagonalChecking(String Shape)
    {
        if
                (
                grid[0][0].equals(Shape)&&
                grid[1][1].equals(Shape)&&
                grid[2][2].equals(Shape)
                )
        {
            return true;
        }
        if
                (
                grid[0][2].equals(Shape)&&
                grid[1][1].equals(Shape)&&
                grid[2][0].equals(Shape)
                )
        {
            return true;
        }
        return false;
    }


}