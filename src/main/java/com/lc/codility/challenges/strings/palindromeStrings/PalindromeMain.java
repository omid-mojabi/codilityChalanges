package com.lc.codility.challenges.strings.palindromeStrings;

import com.lc.codility.challenges.strings.palindromeStrings.solutions.CheckPalindrome;

public class PalindromeMain {

    public static void main(String[] args) {
        CheckPalindrome solution = new CheckPalindrome();
        String testString ="01010";
        System.out.println("for " + testString + " result is: " +solution.isPalindromeRecursive(testString));
        System.out.println("for " + testString + " result is: " +solution.isPalindrome(testString));
        System.out.println("for " + testString + " result is: " +solution.isPalindromeUseStringBuffer(testString));
    }
}
