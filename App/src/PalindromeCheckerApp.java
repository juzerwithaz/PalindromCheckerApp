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
        } else {
            System.out.println(input + "is not  a Palindrome");
        }



/*
========================================================
MAIN CLASS - UseCase3PalindromeCheckerApp
========================================================

Use Case 3: Reverse String Based Palindrome check
 */
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--){
            reversed = reversed + input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println("UC3 Result: " + input + " is a Palindrome");
        }
        else{
            System.out.println("UC3 Result: " + input + " is not a Palindrome");
        }

/*
========================================================
MAIN CLASS - UseCase3PalindromeCheckerApp
========================================================

Use Case 3: Reverse String Based Palindrome check
 */

        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindromeArray = true;
        while (start < end){
            if (chars[start] != chars[end]){
                isPalindromeArray = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindromeArray){
            System.out.println("UC4 Result: " + input + " is a Palindrome");
        }
        else{
            System.out.println("UC4 Result: " + input +" is not a Palindrome");
        }





    }




}