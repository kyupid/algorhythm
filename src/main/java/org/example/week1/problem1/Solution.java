package org.example.week1.problem1;

import java.util.Arrays;

public class Solution {
    public static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int[] copy = Arrays.copyOfRange(arr, 1, arr.length);
        return arr[0] + sum(copy);
    }
}
