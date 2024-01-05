package week1.problem1;

import org.junit.jupiter.api.Test;
import week1.problem1.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testEmptyArrayReturnsZero() {
        assertEquals(0, Solution.sum(new int[]{}));
    }

    @Test
    public void testSumOfArrayElements() {
        assertEquals(10, Solution.sum(new int[]{1, 2, 3, 4}));
        assertEquals(40, Solution.sum(new int[]{-1, 3, 8, 9, 10, 11}));
    }

    @Test
    public void testLargeArrayDoesNotThrowRangeError() {
        int[] largeArray = new int[10000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i + 1;
        }

        assertDoesNotThrow(() -> Solution.sum(largeArray));
    }
}