package org.example.week1.problem1;

import java.util.Arrays;

public class Solution {
    public static int sum(int[] arr) {
        return Arrays.stream(arr)
                .sum();
    }
}
