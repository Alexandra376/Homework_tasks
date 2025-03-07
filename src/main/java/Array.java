import java.util.Random;

public class Array {

    public static void main(String[] args) {
        int[] array = generateRandomArray();
        System.out.printf("Initial array: %s%n", java.util.Arrays.toString(array));

        swapMaxNegativeAndMinPositive(array);
        System.out.println("Modified array: " + java.util.Arrays.toString(array));
    }

    public static int[] generateRandomArray() {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        return array;
    }

    public static void swapMaxNegativeAndMinPositive(int[] array) {
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int maxNegativeIndex = -1;
        int minPositiveIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] > maxNegative) {
                maxNegative = array[i];
                maxNegativeIndex = i;
            }
            if (array[i] > 0 && array[i] < minPositive) {
                minPositive = array[i];
                minPositiveIndex = i;
            }
        }

        if (maxNegativeIndex != -1 && minPositiveIndex != -1) {
            int temp = array[maxNegativeIndex];
            array[maxNegativeIndex] = array[minPositiveIndex];
            array[minPositiveIndex] = temp;
        }
    }
}
