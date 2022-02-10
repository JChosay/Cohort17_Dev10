import java.util.Random;

public class Exercise15 {

    public static void main(String[] args) {
        int[] one = makeRandomArray();
        int[] two = makeRandomArray();
        // 1. Create a new int[] with room enough for all elements in `one` and `two`.
        // 2. Copy elements from `one` into the beginning of the array.
        // 3. Copy elements from `two` at the end of the array.
        // 4. Print the results to confirm that it worked.
        int[] combined = new int[one.length + two.length];
        System.arraycopy(one, 0, combined, 0, one.length);
        System.arraycopy(two, 0, combined, one.length, two.length);
        for (int i = 0; i < combined.length; i++)
            System.out.println(combined[i]);
    }

    public static int[] makeRandomArray() {
        Random random = new Random();
        int[] result = new int[random.nextInt(100) + 50];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(1000) - 500;
        }
        return result;
    }
}
