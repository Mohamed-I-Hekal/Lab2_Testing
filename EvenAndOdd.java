package Lab2;

public class EvenAndOdd {
    public static String Even_or_Odd(double x) {

        if ((x % 2) == 0)
            return "even";
        else return "odd";

    }
    public static int getMaxValue(int[] arr) {
        int val = Integer.MIN_VALUE;

        if (arr.length <= 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > val) {
                val = arr[i];
            }
        }
        return val;
    }

    public static int getMinValue(int[] arr) {
        int val = Integer.MAX_VALUE;

        if (arr.length <= 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        for (int i=0; i < arr.length; i++) {
            if (arr[i] < val) {
                val = arr[i];
            }
        }
        return val;
    }
}

