import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeTest {
  @Test
  void testWordPalindrome() {
    Palindrome wordPalindrome = new Palindrome("peeweep");
    assertTrue(wordPalindrome.isPalindrome());
  }

  @Test
  void testPhrasePalindrome() {
    Palindrome phrasePalindrome = new Palindrome("a man a plan a canal panama");
    assertTrue(phrasePalindrome.isPalindrome());
  }

  @Test
  void testIgnoreSpacesPunctuationPalindrome() {
    Palindrome spacesPunctuationPalindrome = new Palindrome("?a man, a plan, a canal, panama!.");
    assertTrue(spacesPunctuationPalindrome.isPalindrome());
  }

  @Test
  void testIgnoreCasePalindrome() {
    Palindrome mixedCasePalindrome = new Palindrome("pEeWEeP");
    assertTrue(mixedCasePalindrome.isPalindrome());
  }

  @Test
  void testNumericPalindrome() {
    Palindrome numericPalindrome = new Palindrome("12321");
    assertTrue(numericPalindrome.isPalindrome());
  }

  @Test
  void testEmptyPalindrome() {
    Palindrome emptyPalindrome = new Palindrome("");
    assertTrue(emptyPalindrome.isPalindrome());
  }

  @Test
  void testNonAlphanumericPalindrome() {
    Palindrome nonAlphanumericPalindrome = new Palindrome("\";'. ,?:-");
    assertTrue(nonAlphanumericPalindrome.isPalindrome());
  }

  @Test
  void testNonPalindrome() {
    Palindrome notPalindrome = new Palindrome("nope!");
    assertFalse(notPalindrome.isPalindrome());
  }
}