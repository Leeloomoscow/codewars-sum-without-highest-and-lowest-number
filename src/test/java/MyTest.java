import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void BasicTests() {
        assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));
    }

    private static class Kata {
        public static int sum(int[] numbers) {
            Arrays.sort(numbers);
                int sum = 0;
                for (int i = 1; i < numbers.length - 1; i++) {
                    sum += numbers[i];
                }
                return sum;
            }
        }
    }
