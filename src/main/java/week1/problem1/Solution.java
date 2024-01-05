package week1.problem1;

import java.util.Arrays;

public class Solution {
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    private static int sum(int[] arr, int acc) {
        if (arr.length == 0) {
            return acc;
        }
        int[] copy = Arrays.copyOfRange(arr, 1, arr.length);
        return sum(copy, acc + arr[0]);
    }
}
