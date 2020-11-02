/**
 * Zak Sakata
 * CSE360 Assignment 4
 * Palindrome is a class that is used to determine if a string is a palindrome
 */

public class Palindrome {
  private String testString;

  /**
   * Palindrome constructor initializing testString to an all lowercase, alphanumeric only string
   *
   * @param testString to be evaluated
   */
  Palindrome(String testString) {
    this.testString = testString.toLowerCase().replaceAll("\\P{Alnum}", "");
  }

  /**
   * Evaluates if testString is a palindrome
   *
   * @return boolean indicating if palindrome
   */
  boolean isPalindrome() {
    if (testString.equals("")) return true;

    int left = 0;
    int right = testString.length() - 1;

    boolean palindrome = true;
    while (palindrome && left++ < right--) {
      palindrome = testString.charAt(left) == testString.charAt(right);
    }
    return palindrome;
  }
}