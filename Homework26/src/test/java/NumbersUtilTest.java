import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "NumberUtil is working when")
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
class NumbersUtilTest {

    private final NumbersUtil numbersUtil = new NumbersUtil();

    @Nested
    @DisplayName("isGcd() is working")
    public class ForIsGcd {
        @ParameterizedTest(name = "return {2} on {0} + {1}")
        @CsvSource(value = {"48, 18, 6", "49, 21, 7", "9, 57, 3"})
        public void return_correct_gcd(int a, int b, int result) {
            assertEquals(result, numbersUtil.gcd(a, b));
        }

        @ParameterizedTest(name = "return {2} on {0} + {1}")
        @CsvSource(value = {"120, 7, 1", "7, 2, 1", "14, 19, 1"})
        public void return_correct_ugly_numbers_gcd(int a, int b, int result) {
            assertEquals(result, numbersUtil.gcd(a, b));
        }

        @ParameterizedTest(name = "throws exception on {0}")
        @CsvSource(value = {"-1, 18", "45, -5", "-114, 2"})
        public void bad_numbers_throws_exception(int badNumberA, int badNumberB) {
            assertThrows(IllegalArgumentException.class, () -> numbersUtil.gcd(badNumberA, badNumberB));
        }
    }
}