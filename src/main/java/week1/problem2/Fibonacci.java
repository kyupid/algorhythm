package week1.problem2;

public class Fibonacci {

    public static int calculate(int n) {
        if (n <= 0) {
            return 0;
        }
        return calculateTailRec(0, 1, n);
        // 1 -> 1
    }

    private static int calculateTailRec(int a, int b, int count) {
        // 종료 조건 도달하기 위한 count
        count--;

        // 종료 조건
        if (count == 0) {
            return b;
        }
        return calculateTailRec(b, a + b, count);
    }
}
