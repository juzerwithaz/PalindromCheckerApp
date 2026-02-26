/**
 * ===================================================
 * MAIN CLASS - UseCase1PalindromeApp
 * ===================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * palindrome checker Management System.
**/
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome app management system");

//-----------------------------------------------------------------------

/*
========================================================
MAIN CLASS - UseCase2PalindromeCheckerApp
========================================================

Use Case 2: Hardcoded Palindrom Validation
 */
        String input = "racecar";
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        }else{
            System.out.println(input + "is not  a Palindrome");
        }

    }
}