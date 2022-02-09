import java.util.Scanner;
public class WarmUp {
    public static void main(String[] args) {
        //A: Knock, knock.
        //B: Who's there?
        //A: The interrupting cow.
        //B: The interrupting cow--
        //A: Moo
        Scanner console = new Scanner(System.in);
        boolean endLoop = false;
        do {
            menu();
            int input = console.nextInt();
            switch (input) {
                case 1:
                    joke1();
                    break;
                case 2:
                    joke2();
                    break;
                case 3:
                    joke3();
                    break;
                case 4:
                    endLoop = true;
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
                    break;
            }
            System.out.println("Would you like to hear another joke?");
        } while (endLoop == false);

    }
    public static void menu(){
        System.out.println("1. Joke 1!");
        System.out.println("2. Joke 2!");
        System.out.println("3. Joke 3!");
        System.out.println("4. No more jokes...");
        System.out.print("Enter a number [1-4]:");
    }
    public static void jokeTemplate(String joke, String punchLine)
    {
        boolean endLoop = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Knock, knock.");

        do{
            String who = input.nextLine();
            endLoop = who.equalsIgnoreCase("Who's there?");
        } while (endLoop == false);

        System.out.println(joke);
        boolean endLoop2 = false;
        do{
            String who = input.nextLine();
            endLoop2 = who.equalsIgnoreCase((joke + ", who?"));
        } while (endLoop2 == false);
        System.out.println(punchLine);
    }
    //2. Knock, knock.
    //Who’s there?
    //Tank.
    //Tank who?
    //"You’re welcome.""
    public static void joke1(){
        jokeTemplate("Tank", "You’re welcome.");
    }
    // Knock, knock.
    //Who’s there?
    //Cow says.
    //Cow says who?
    //No, a cow says mooooo!
    public static void joke2(){
        jokeTemplate("Cow says", "No, a cow says moooo!");
    }
    // 14. Knock, knock.
    //Who’s there?
    //Hawaii.
    //Hawaii who?
    //I’m good. Hawaii you?

    public static void joke3(){
        jokeTemplate("Hawaii", "I'm good. Hawaii you?");
    }
}
