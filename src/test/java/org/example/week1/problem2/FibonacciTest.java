package org.example.week1.problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    @DisplayName("음수가 주어지면 0을 반환한다")
     void testNegativeNumber() {
        assertEquals(0, Fibonacci.calculate(-1));
    }

    @Test
    @DisplayName("0부터 1까지는 정해진 수를 반환한다")
     void testBaseCases() {
        assertEquals(0, Fibonacci.calculate(0));
        assertEquals(1, Fibonacci.calculate(1));
    }

    @Test
    @DisplayName("2이상 주어지면 앞 두 항의 합을 반환한다")
     void testSumOfTwoPrevious() {
        assertEquals(1, Fibonacci.calculate(2));
        assertEquals(2, Fibonacci.calculate(3));
        assertEquals(3, Fibonacci.calculate(4));
        assertEquals(5, Fibonacci.calculate(5));
        assertEquals(8, Fibonacci.calculate(6));
    }

    @Test
    @DisplayName("큰 입력이 주어져도 RangeError를 던지지 않는다")
     void testLargeInput() {
        assertDoesNotThrow(() -> Fibonacci.calculate(100000));
    }
}
