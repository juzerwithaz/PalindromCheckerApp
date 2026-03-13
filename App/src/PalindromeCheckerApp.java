/**
 * ===================================================
 * MAIN CLASS - PalindromeCheckerApp
 * ===================================================
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome app management system");

        String input = "racecar";

        /*
        ========================================================
        Use Case 2: Hardcoded Palindrome Validation
        ========================================================
        */
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
            System.out.println(input + " is not a Palindrome");
        }

        /*
        ========================================================
        Use Case 3: Reverse String Based Palindrome Check
        ========================================================
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
        Use Case 4: Character Array Based Palindrome Check
        ========================================================
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
        Use Case 5: Stack Based Palindrome Check
        ========================================================
        */
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindromeStack = true;

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
        Use Case 6: Queue + Stack Based Palindrome Check
        ========================================================
        */
        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack2 = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        boolean isPalindromeQS = true;

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
        Use Case 7: Deque Based Optimized Palindrome Check
        ========================================================
        */
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindromeDeque = true;

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
        Use Case 8: Linked List Based Palindrome Check
        ========================================================
        */
        java.util.LinkedList<Character> list = new java.util.LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindromeLL = true;

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

        /*
        ========================================================
        Use Case 9: Recursive Palindrome Check
        ========================================================
        */
        boolean isPalindromeRecursive = checkPalindrome(input, 0, input.length() - 1);

        if (isPalindromeRecursive) {
            System.out.println("UC9 Result: " + input + " is a Palindrome");
        } else {
            System.out.println("UC9 Result: " + input + " is not a Palindrome");
        }

        /*
        ========================================================
        Use Case 10: Case-Insensitive & Space-Ignored Palindrome
        ========================================================
        */
        String input2 = "A man a plan a canal Panama";

        String normalized = input2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindromeNormalized = true;

        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindromeNormalized = false;
                break;
            }
        }

        if (isPalindromeNormalized) {
            System.out.println("UC10 Result: \"" + input2 + "\" is a Palindrome");
        } else {
            System.out.println("UC10 Result: \"" + input2 + "\" is not a Palindrome");
        }
    }


    /*
    ========================================================
    Recursive Method for UC9
    ========================================================
    */
    private static boolean checkPalindrome(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return checkPalindrome(s, start + 1, end - 1);
    }
}