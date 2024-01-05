package week1.problem2;

public class Fibonacci {
    public static int calculate(int i) {
        // 0, 1, 1, 2, 3, 5, 8, 13, ...
        if (i <= 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        // todo if i > 1
        return calculate(i - 1) + calculate(i - 2);
    }
}
