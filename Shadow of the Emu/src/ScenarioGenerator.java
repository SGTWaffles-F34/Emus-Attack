import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ScenarioGenerator
{
    private final int numLocations = 10;
    private Location[] locations = new Location[numLocations];

    private Random rand = new Random();

    private Scanner reader = null;

    public ScenarioGenerator()
    {
        //Verify that Location file is visible before reading from it to avoid errors

        System.out.println("Loading Location Data...");

        try
        {
            reader = new Scanner(new FileInputStream("C:/Users/gavin/IdeaProjects/Shadow of the Emu/src/gameFiles/Locations.txt"));
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        String[] temp1 = new String[numLocations];
        String[] temp2;

        for(int i = 0; i<numLocations; i++)
        {
            temp1[i] = reader.nextLine();
        }

        for(int i = 0; i<temp1.length; i++)
        {
            temp2 = temp1[i].split(",");

            locations[i] = new Location(temp2[0],Integer.parseInt(temp2[1]),Integer.parseInt(temp2[2]),Integer.parseInt(temp2[3]),Integer.parseInt(temp2[4]),Integer.parseInt(temp2[5]));
        }

        System.out.println("Location Data loaded!");
        System.out.println();
        System.out.println("Yay! Game is loaded Faggot!");
        System.out.println();

    }

    public void menu()
    {
        System.out.println("---------Menu---------" + "\n" + "1) Load new location" + "\n" + "2) End Game");
    }

    public void genNewLocation()
    {
        int i = rand.nextInt(numLocations);
        System.out.println("Location: " + locations[i].getLocationName());
        System.out.println();
        System.out.println("Melee Loot Present: " + locations[i].isMeleeLoot());
        System.out.println("Find Chance: " + locations[i].getMeleeLootValue());
        System.out.println("Gun Loot Present: " + locations[i].isGunLoot());
        System.out.println("Find Chance: " + locations[i].getGunLootValue());
        System.out.println("Medical Loot Present: " + locations[i].isMedicalLoot());
        System.out.println("Find Chance: " + locations[i].getMedicalLootValue());
        System.out.println("Food Loot Present: " + locations[i].isFoodLoot());
        System.out.println("Find Chance: " + locations[i].getFoodLootValue());
        System.out.println();
    }

}
