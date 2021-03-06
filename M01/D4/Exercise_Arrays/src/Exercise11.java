import java.util.Random;

public class Exercise11 {

    public static void main(String[] args) {
        int[] values = makeRandomArray();
        int numOfPositive = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0)
                numOfPositive++;
        }
        int[] positiveNumbers = new int[numOfPositive];
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] > 0) {
                positiveNumbers[numOfPositive - 1] = values[i];
                numOfPositive--;
            }
        }
        for (int i = 0; i < positiveNumbers.length; i++)
            System.out.println(positiveNumbers[i]);
        // 1. Count the number of positive elements in `values`.
        // 2. Create a new int[] to hold the positive elements.
        // (We must count first to know the capacity to allocate.)
        // 3. Loop through `values` a second time. Add positive elements to the new array.
        // 4. Confirm the positive array is properly populated either by debugging or printing its elements.
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
