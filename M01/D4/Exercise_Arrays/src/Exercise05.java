public class Exercise05 {

    public static void main(String[] args) {
        // 1. Declare an array to hold the names of the world's continents.
        // Do not use array literal notation. Allocate space for 6 continents and then set each value by index.
        // 2. Loop over each element and print it.
        String[] continentNames = new String[6];
        continentNames[0] = "North America"; continentNames[1] = "South America"; continentNames[2] = "Europe";
        continentNames[4] = "Asia"; continentNames[5] = "Africa"; continentNames[6] = "Australia";
        for (int i = 0; i < continentNames.length; i++)
            System.out.println(continentNames[i]);
    }
}
