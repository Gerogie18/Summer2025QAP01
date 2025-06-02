package JenniferLyver.Summer2025QAP01;

import JenniferLyver.Summer2025QAP01.utils.ValidationUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {

    @Test
    void testValidatePositiveValue_ValidValue_NoException() {
        Assertions.assertDoesNotThrow(() -> ValidationUtils.validatePositiveValue(1, "Test Value"));
    }

    @Test
    void testValidatePositiveValue_ZeroValue_ThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> ValidationUtils.validatePositiveValue(0, "Test Value"));
    }

    @Test
    void testValidatePositiveValue_NegativeValue_ThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> ValidationUtils.validatePositiveValue(-1, "Test Value"));
    }
}