import java.util.Random;
import java.util.Scanner;

public class Game {
    // constants
    private final static String EMPTY_CHARACTER = " ";
    private final static String DARK_CHARACTER = "-";

    private static int width = 10;
    private static String wallCharacter = "#";

    private final Scanner console = new Scanner(System.in);
    private Hero hero;
    private Treasure[] treasure = new Treasure[2];
    private boolean isOver;

    public void run() {
        setUp();
        while (!isOver) {
            printWorld();
            move();
        }
        printWorld();
    }

    private void setUp() {
        System.out.print("What is the name of your hero?: ");
        String name = console.nextLine();

        int inputSize;
        do {
            System.out.print("How big do you want your map to be (min is 5, max is 25)? Enter a positive integer: ");
            inputSize = Integer.parseInt(console.nextLine());
            if (inputSize < 5 || inputSize > 25){
                inputSize = 0;
                System.out.println("Invalid map size. Please reread instructions and try again!\n");
            }
        } while (inputSize == 0);
        width = inputSize;

        Random rand = new Random();
        int x = rand.nextInt(width);
        int y = rand.nextInt(width);

        hero = new Hero(name, x, y);

        char inputChar, confirm;
        System.out.printf("%c is the current character symbol for your hero. Would you like to change it? Enter [y/n]: ", hero.getSymbol());
        inputChar = console.nextLine().charAt(0);
        if (inputChar == 'y') {
            do {
                System.out.print("Please enter the character symbol you would like to use for your hero: ");
                inputChar = console.nextLine().charAt(0);
                hero.setSymbol(inputChar);
                System.out.printf("The symbol has been changed to %c. Would you like to change it again? Enter [y/n]: ", hero.getSymbol());
                confirm = console.nextLine().charAt(0);
            } while (confirm != 'n');
        }

        confirm = 'y';
        String inputString;
        System.out.printf("%s is the current wall character symbol. Would you like to change it? Enter [y/n]: ", wallCharacter);
        inputChar = console.nextLine().charAt(0);
        if (inputChar == 'y') {
            do {
                System.out.print("Please enter the character you would like to use for the wall (can't be the same as hero's symbol): ");
                inputString = console.nextLine();
                if (inputString.length() != 1)
                    System.out.println("Please enter only a character for the wall!\n");
                else if (inputString.charAt(0) == hero.getSymbol())
                    System.out.println("The hero's character symbol and the wall's character symbol cannot match!\n");
                else {
                    System.out.printf("The symbol has been changed to %s. Would you like to change it again? Enter [y/n]: ", inputString);
                    wallCharacter = inputString;
                    confirm = console.nextLine().charAt(0);
                }
            } while (confirm != 'n');
        }
        setUpTreasure();
    }

    private void setUpTreasure(){
        Random rand = new Random();
        int x, y;
        for (int i = 0; i < treasure.length; i++) {
            do {
                x = rand.nextInt(width);
                y = rand.nextInt(width);
            } while ((x > hero.getX() - 2 && x < hero.getX() + 2) && (y > hero.getY() - 2 && y < hero.getY() + 2) );
            treasure[i] = new Treasure(x, y);
        }
    }

    private void printWorld() {
        // top wall border
        System.out.println(wallCharacter.repeat(width + 2));

        for (int row = 0; row < width; row++) {
            // left wall border
            System.out.print(wallCharacter);

            for (int col = 0; col < width; col++) {
                if (row == hero.getY() && col == hero.getX()) {
                    System.out.print(hero.getSymbol());
                } else if ( (row == treasure[0].getY() && col == treasure[0].getX()) || (row == treasure[1].getY() && col == treasure[1].getX())) {
                    // Check if hero can see treasure, then print treasure or dark character.
                    if (treasure[0].getY() == row && treasure[0].getX() == col)
                    {
                        if ( (row >= hero.getY() - hero.getVisionRange()) && (row <= hero.getY() + hero.getVisionRange())) {
                            if ( (col >= hero.getX() - hero.getVisionRange()) && (col <= hero.getX() + hero.getVisionRange())) {
                                if (treasure[0].getTreasureStatus() == false)
                                    System.out.print("T");
                                else
                                    System.out.print(EMPTY_CHARACTER);
                            }
                            else
                                System.out.print(DARK_CHARACTER);
                        }
                        else
                            System.out.print(DARK_CHARACTER);
                    }
                    else {
                        if ( (row >= hero.getY() - hero.getVisionRange()) && (row <= hero.getY() + hero.getVisionRange())) {
                            if ( (col >= hero.getX() - hero.getVisionRange()) && (col <= hero.getX() + hero.getVisionRange())) {
                                if (treasure[1].getTreasureStatus() == false)
                                    System.out.print("T");
                                else
                                    System.out.print(EMPTY_CHARACTER);
                            }
                            else
                                System.out.print(DARK_CHARACTER);
                        }
                        else
                            System.out.print(DARK_CHARACTER);
                    }
                } else {
                    // Print the world as far as the hero can see.
                    if (row >= hero.getY() - hero.getLightRange() && row <= hero.getY() + hero.getLightRange()) {
                        if (col >= hero.getX() - hero.getLightRange() && col <= hero.getX() + hero.getLightRange())
                            System.out.print(EMPTY_CHARACTER);
                        else
                            System.out.print(DARK_CHARACTER);
                    } else
                        System.out.print(DARK_CHARACTER);
                }
            }

            // right wall border
            System.out.println(wallCharacter);
        }

        // bottom wall border
        System.out.println(wallCharacter.repeat(width + 2));

        System.out.printf("1 - X:%d Y:%d\n2 - X:%d Y:%d\n", treasure[0].getX(), treasure[0].getY(), treasure[1].getX(), treasure[1].getY());
    }

    private void move() {

        System.out.print(hero.getName() + ", move [WASD]: ");
        String move = console.nextLine().trim().toUpperCase();

        if (move.length() != 1) {
            return;
        }

        switch (move.charAt(0)) {
            case 'W':
                hero.moveUp();
                break;
            case 'A':
                hero.moveLeft();
                break;
            case 'S':
                hero.moveDown();
                break;
            case 'D':
                hero.moveRight();
                break;
        }

        if (hero.getX() < 0 || hero.getX() >= width
                || hero.getY() < 0 || hero.getY() >= width) {
            System.out.println(hero.getName() + " touched lava! You lose.");
            isOver = true;
        } else if ( (hero.getX() == treasure[0].getX() && hero.getY() == treasure[0].getY())
                || (hero.getX() == treasure[1].getX() && hero.getY() == treasure[1].getY())) {
            if (treasure[0].getTreasureStatus() == false && (hero.getX() == treasure[0].getX() && hero.getY() == treasure[0].getY()))
            {
                treasure[0].treasureFound();
                System.out.println(hero.getName() + " found a treasure!");
            }
            if (treasure[1].getTreasureStatus() == false && (hero.getX() == treasure[1].getX() && hero.getY() == treasure[1].getY())) {
                treasure[1].treasureFound();
                System.out.println(hero.getName() + " found a treasure!");
            }
        }
        if (treasure[0].getTreasureStatus() && treasure[1].getTreasureStatus()) {
            System.out.println(hero.getName() + " found all the treasures! You win!");
            isOver = true;
        }
    }
}
