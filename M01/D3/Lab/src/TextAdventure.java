import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        boolean gameOver = false;
        // axe, wood, fuel, firstAid, phone, lighter
        boolean [] itemStatus = new boolean[6];
        for (int i = 0; i < 6; i++)
            itemStatus[i] = false;

        Scanner console = new Scanner(System.in);
        int input;
        intro();

        do {
            System.out.println("1: Play intro.\n2: Check forest (area).\n3: Go to the car (area)\n4: Visit cabin wreckage(area)\nEnter a number [1-4]:");
            input = console.nextInt();
            menu(input, itemStatus);
            gameOver = gameStatus(itemStatus);
            if (gameOver)
                System.out.println("Congratulations! You found all the items and survived until you got help!");
        } while (gameOver == false);
        //printWin(String "win");
    }

    public static boolean gameStatus(boolean[] itemStatus)
    {
        if (itemStatus[0] == true && itemStatus[1]  == true && itemStatus[2]  == true && itemStatus[3]  == true && itemStatus[4]  == true && itemStatus[5]  == true)
            return true;
        else
            return false;
    }

    public static boolean[] menu(int choice, boolean [] itemStatus){
        boolean [] array = new boolean[2];
        switch(choice){
            case 1:
                intro();
                break;
            case 2:
                array = forest(itemStatus[0], itemStatus[1]);
                itemStatus[0] = array[0];
                itemStatus[1] = array[1];
                break;
            case 3:
                array = car(itemStatus[2], itemStatus[3]);
                itemStatus[2] = array[0];
                itemStatus[3] = array[1];
                break;
            case 4:
                array = cabin(itemStatus[4], itemStatus[5]);
                itemStatus[4] = array[0];
                itemStatus[5] = array[1];
                break;
            default:
                System.out.printf("Invalid input. Try again");
                break;
        }
        return itemStatus;
    }
    public static void intro(){
        System.out.println("You were out camping near a cabin in the North. Suddenly an avalanche came down while you were out gathering fire wood.\n" +
                "You made it out with a few injuries and now you are trying to get out of this sticky situation.\n" +
                "The objective is to find 6 items (medical supplies, tool box/tool, and something to navigate or contact civilization).");
    }
    public static boolean[] forest(boolean axe, boolean wood){
        System.out.println("You head over to the forest where you went to cut down wood before the avalanche hit.");
        System.out.println("1: Search for your axe.\n2: Gather wood.\n3: Return\nEnter a number [1-3]:");
        Scanner console = new Scanner(System.in);
        int choice = console.nextInt();
        boolean loop = true, returnValue [] = {axe, wood};
        do{
            switch (choice)
            {
                case 1:
                    if (axe == false) {
                        System.out.println("After retracing your steps, you found where you left your axe!");
                        returnValue[0] = true;
                    }
                    loop = false;
                    break;
                case 2:
                    if (wood == false) {
                        System.out.println("You head over to the scattered logs and branches and gather them.");
                        returnValue[1] = true;
                    }
                    loop = false;
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.printf("Invalid input. Try again");
                    break;
            }
        } while (loop);
        return returnValue;
    }
    public static boolean[] car(boolean fuel, boolean firstAid){
        System.out.println("You head over to the car buried mostly by the snow.");
        System.out.println("1: Check trunk.\n2: Check passenger seats.\n3: Return\nEnter a number [1-3]:");
        Scanner console = new Scanner(System.in);
        int choice = console.nextInt();
        boolean loop = true, returnValue [] = {fuel, firstAid};
        do{
            switch (choice)
            {
                case 1:
                    if (fuel == false) {
                        System.out.println("After opening the trunk, you take out the fuel can that was in there.");
                        returnValue[0] = true;
                    }
                    loop = false;
                    break;
                case 2:
                    if (firstAid == false) {
                        System.out.println("You find a first aid kit in the back of the car seats!");
                        returnValue[1] = true;
                    }
                    loop = false;
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.printf("Invalid input. Try again");
                    break;
            }
        } while (loop);
        return returnValue;
    }
    public static boolean[]  cabin(boolean phone, boolean lighter){
        System.out.println("You head over to the wreckage of the cabin under snow");
        System.out.println("1: Dig under wreckage.\n2: Salvage around the cabin.\n3: Return\nEnter a number [1-3]:");
        Scanner console = new Scanner(System.in);
        int choice = console.nextInt();
        boolean loop = true, returnValue [] = {phone, lighter};
        do{
            switch (choice)
            {
                case 1:
                    if (phone == false) {
                        System.out.println("You dug and found your phone!");
                        returnValue[0] = true;
                    }
                    loop = false;
                    break;
                case 2:
                    if (lighter == false) {
                        System.out.println("After looking around, you found a lighter!");
                        returnValue[1] = true;
                    }
                    loop = false;
                    break;
                case 3:
                    System.out.println("You decide to head back.");
                    loop = false;
                    break;
                default:
                    System.out.printf("Invalid input. Try again");
                    break;
            }
        } while (loop);
        return returnValue;
    }
}
