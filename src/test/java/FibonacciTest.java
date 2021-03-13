import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FibonacciTest {

    @Test
    @ValueSource(ints = {4, 10, 5, -10})
    private void testFibonacci(int n) {
        System.out.println(n);
        assertEquals(10, n, "Invalid number expected:"+n);
    }
}
