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
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println("UC3 Result: " + input + " is a Palindrome");
        } else {
            System.out.println("UC3 Result: " + input + " is not a Palindrome");
        }

/*
========================================================
MAIN CLASS - UseCase4PalindromeCheckerApp
========================================================

Use Case 4: Character Array Based Palindrome Check

 */

        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindromeArray = true;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindromeArray = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindromeArray) {
            System.out.println("UC4 Result: " + input + " is a Palindrome");
        } else {
            System.out.println("UC4 Result: " + input + " is not a Palindrome");
        }




    /*
========================================================
MAIN CLASS - UseCase5PalindromeCheckerApp
========================================================

Use Case 5: Stack Based Palindrome Check
 */
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindromeStack = true;

        // Pop and compare
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindromeStack = false;
                break;
            }
        }

        if (isPalindromeStack) {
            System.out.println("UC5 Result: " + input + " is a Palindrome");
        } else {
            System.out.println("UC5 Result: " + input + " is not a Palindrome");
        }


        /*
========================================================
MAIN CLASS - UseCase6PalindromeCheckerApp
========================================================

Use Case 6: Queue + Stack Based Palindrome Check
 */

        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack2 = new java.util.Stack<>();

// Insert characters into queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        boolean isPalindromeQS = true;

// Compare queue and stack outputs
        while (!queue.isEmpty()) {
            if (queue.remove() != stack2.pop()) {
                isPalindromeQS = false;
                break;
            }
        }

        if (isPalindromeQS) {
            System.out.println("UC6 Result: " + input + " is a Palindrome");
        } else {
            System.out.println("UC6 Result: " + input + " is not a Palindrome");
        }
        /*
========================================================
MAIN CLASS - UseCase7PalindromeCheckerApp
========================================================

Use Case 7: Deque Based Optimized Palindrome Check
 */

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

// Add characters to deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindromeDeque = true;

// Compare front and rear elements
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindromeDeque = false;
                break;
            }
        }

        if (isPalindromeDeque) {
            System.out.println("UC7 Result: " + input + " is a Palindrome");
        } else {
            System.out.println("UC7 Result: " + input + " is not a Palindrome");
        }

        /*
========================================================
MAIN CLASS - UseCase8PalindromeCheckerApp
========================================================

Use Case 8: Linked List Based Palindrome Check
 */

        java.util.LinkedList<Character> list = new java.util.LinkedList<>();

// Add characters into linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindromeLL = true;

// Compare first and last elements
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindromeLL = false;
                break;
            }
        }

        if (isPalindromeLL) {
            System.out.println("UC8 Result: " + input + " is a Palindrome");
        } else {
            System.out.println("UC8 Result: " + input + " is not a Palindrome");
        }
    }
}
