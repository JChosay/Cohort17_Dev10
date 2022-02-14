public class Exercise02 {

    public static void main(String[] args) {

        // 1. Add a getter for the rating field in Musician.

        Musician ocean = new Musician("Frank Ocean", 10);
        System.out.println(ocean.getName());
        // 2. Uncomment the line below and insure that it compiles and runs.
        System.out.println(ocean.getRating());

        // 3. Instantiate two musicians and assign them to new variables.
        // 4. Print each musicians' name and rating on a single line.
        Musician doe = new Musician("John Doe", 5);
        Musician lee = new Musician("Rock Lee", 8);
        System.out.printf("%s, rating: %d\n%s, rating: %d\n", doe.getName(), doe.getRating(), lee.getName(), lee.getRating());
    }
}
