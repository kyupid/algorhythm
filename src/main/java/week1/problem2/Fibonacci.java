package week1.problem2;

public class Fibonacci {
    public static int calculate(int i) {
        // 0, 1, 1, 2, 3, 5, 8, 13, ...
        if (i <= 0) {
            return 0;
        }
        int first = 0;
        int second = 1;
        int result;

        for (int j = 0; j < i; j++) {
            result = first + second;
            first = second;
            second = result;
        }
        return first;
    }
}
