package main.java.handlers;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayHandler {
    public static void reverseOrder(Integer[] arr) {
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println("Sorted in revers order array: " + Arrays.toString(arr));
    }

    public static String posSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i > 0) {
                sum += i;
            }
        }
        return "The sum of all positive numbers in array " + Arrays.toString(array) + " = " + sum;
    }

    public static String average(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        double average = sum / array.length;

        int iMax = array.length - 1;
        StringBuilder b = new StringBuilder();
        b.append('{');
        for (int i = 0; ; i++) {
            b.append(array[i]);
            if (i == iMax) {
                b.append('}');
                break;
            }
            b.append(", ");
        }
        return "array" + b.toString() + " -> avg = " + average;
    }
}
