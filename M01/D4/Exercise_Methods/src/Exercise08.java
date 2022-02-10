public class Exercise08 {

    // 1. Create a method.
    // Name: getRandomFruit
    // Inputs: none
    // Output: String
    // Description: returns a random fruit name as a string.
    // See Exercise01.
    // Choose from at least 5 fruit.
    public static String getRandomFruit(){
        switch ((int) (Math.random() * 5)) {
            case 0:
                return "Apple";
            case 1:
                return "Kiwi";
            case 2:
                return "Pineapple";
            case 3:
                return "Peach";
            case 4:
                return "Strawberry";
            case 5:
                return "Coconut";
        };
        return "";
    }

    public static void main(String[] args) {
        // 2. Call your method in various ways to test it here.
        System.out.printf("Random Fruits:\n%s\n%s\n%s\n%s\n%s", getRandomFruit(), getRandomFruit(), getRandomFruit(), getRandomFruit(), getRandomFruit());
    }
}
