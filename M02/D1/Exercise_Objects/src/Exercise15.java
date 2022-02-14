public class Exercise15 {

    // 1. Create a new method in the Hero class.
    // Name: toLine
    // Inputs: none
    // Output: String
    // Description: returns the Hero's name and powers as a single line of text.

    public static void main(String[] args) {
        // 2. Instantiate your three favorite super heroes with appropriate powers.
        // 3. Use the `toLine` method to print each hero's details to the console.
        Hero[] heroes = {
                new Hero("Flash", new Power[]{new Power("Super Speed"), new Power("Intelligence"), new Power("Time Travel")}),
                new Hero("Batman", new Power[]{new Power("Willpower"), new Power("Intelligence")}),
                new Hero("Hulk", new Power[]{new Power("Super Strength"), new Power("Durability"), new Power("Rage")})
        };
        for (int i = 0; i < heroes.length; i++)
            System.out.println(heroes[i].toLine());
    }
}
