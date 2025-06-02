package JenniferLyver.Summer2025QAP01.utils;



public class ValidationUtils {
    public static void validatePositiveValue(int value, String fieldName) {
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + " must be greater than 0");
        }
    }
}
