import java.util.Random;

class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        final int RANGE_BOUND = 100;

        int[] arr = new int[10];
        int min = RANGE_BOUND + 1, max = RANGE_BOUND - 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(RANGE_BOUND) + 1;
            System.out.print(arr[i] + " ");

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
    }
}
