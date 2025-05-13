import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParenthesesValidatorTest {
    @Test
    public void testEmptyStringIsValid() {
        assertTrue(ParenthesesValidator.isValid(""));
    }

    @Test
    public void testNullInputIsInvalid() {
        assertFalse(ParenthesesValidator.isValid(null));
    }

    @Test
    public void testWhitespaceOnlyInputIsInvalid() {
        assertFalse(ParenthesesValidator.isValid("   "));
    }

    @Test
    public void testNonParenthesisCharactersAreInvalid() {
        assertFalse(ParenthesesValidator.isValid("abc"));
    }

    @Test
    public void testSingleOpeningParenthesisIsInvalid () {
        assertFalse(ParenthesesValidator.isValid("("));
    }

    @Test
    public void testSingleClosingParenthesisIsInvalid () {
        assertFalse(ParenthesesValidator.isValid(")"));
    }

    @Test
    public void testSinglePairIsValid() {
        assertTrue(ParenthesesValidator.isValid("()"));
    }
}
