/*
 *  Gavin Sherman
 *  5/4/19
 *  This class is used to define a Location for the Shadow of the Emu RPG DM tool.
 */



import java.util.Random;

public class Location
{
    private String locationName; //Name of this Location (Gas Station, Hospital, etc...)

    private int[] lootFindValues = new int[4]; //Stores a series of ints that correspond to the chances of finding certain loot in a given location
    private String[] lootTypes = {"Melee:", "Gun:", "Medical:", "Food:"};
    private int emuDensity; //Stores a base value representing the certain number of emus in this kind of location

    private Random rand = new Random();

    public Location(String name, int meleeLoot, int gunLoot, int medLoot, int foodLoot, int emuDensity)
    {
        //sets LocationName
        this.locationName = name;

        //Sets Loot find values
        this.lootFindValues[0] = meleeLoot;
        this.lootFindValues[1] = gunLoot;
        this.lootFindValues[2] = medLoot;
        this.lootFindValues[3] = foodLoot;
        this.emuDensity = emuDensity;
    }

    public String getLocationName()
    {
        return this.locationName;
    }

    public int getMeleeLootValue()
    {
        return this.lootFindValues[0];
    }

    public int getGunLootValue()
    {
        return this.lootFindValues[1];
    }

    public int getMedicalLootValue()
    {
        return this.lootFindValues[2];
    }

    public int getFoodLootValue()
    {
        return this.lootFindValues[3];
    }

    public String toString()
    {
        String lootValues = "";

        for(int i = 0; i<lootFindValues.length; i++)
        {
            lootValues += " " + (lootTypes[i] + lootFindValues[i]);
        }

        return this.locationName + " " + lootValues + " Emu Density:" + emuDensity;
    }

    public Boolean isMeleeLoot()
    {
        int i = rand.nextInt(100) + 1;

        if(lootFindValues[0] == 1) { if(i % 10 == 0) { return true; } }
        if(lootFindValues[0] == 2) { if(i % 4 == 0) { return true; } }
        if(lootFindValues[0] == 3) { if(i % 2 == 0) { return true; } }
        if(lootFindValues[0] == 4) { if(i <= 75) { return true; } }

        return false;
    }

    public Boolean isGunLoot()
    {
        int i = rand.nextInt(100) + 1;

        if(lootFindValues[1] == 1) { if(i % 10 == 0) { return true; } }
        if(lootFindValues[1] == 2) { if(i % 4 == 0) { return true; } }
        if(lootFindValues[1] == 3) { if(i % 2 == 0) { return true; } }
        if(lootFindValues[1] == 4) { if(i <= 75) { return true; } }

        return false;
    }

    public Boolean isMedicalLoot()
    {
        int i = rand.nextInt(100) + 1;

        if(lootFindValues[2] == 1) { if(i % 10 == 0) { return true; } }
        if(lootFindValues[2] == 2) { if(i % 4 == 0) { return true; } }
        if(lootFindValues[2] == 3) { if(i % 2 == 0) { return true; } }
        if(lootFindValues[2] == 4) { if(i <= 75) { return true; } }

        return false;
    }

    public Boolean isFoodLoot()
    {
        int i = rand.nextInt(100) + 1;

        if(lootFindValues[3] == 1) { if(i % 10 == 0) { return true; } }
        if(lootFindValues[3] == 2) { if(i % 4 == 0) { return true; } }
        if(lootFindValues[3] == 3) { if(i % 2 == 0) { return true; } }
        if(lootFindValues[3] == 4) { if(i <= 75) { return true; } }

        return false;
    }
}
