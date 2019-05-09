import java.util.Scanner;

public class EmuRunner
{

    public static void main(String args[])
    {
        ScenarioGenerator game = new ScenarioGenerator();

        Scanner consoleIn = new Scanner(System.in); //Reads in user input for use
        int menuOption; //Stores user input for menu navigation
        boolean gameRunning = true; //maintains gameloop so game continues until told otherwise

        while(gameRunning)
        {
            game.menu();

            menuOption = consoleIn.nextInt();
            System.out.println();

            if(menuOption == 1)
            {
                game.genNewLocation();
            }
            else if(menuOption == 2)
            {
                System.out.println("Fine then, fuck you too! Later bitch");
                System.exit(0);
            }

            System.out.println();

        }
    }
}
