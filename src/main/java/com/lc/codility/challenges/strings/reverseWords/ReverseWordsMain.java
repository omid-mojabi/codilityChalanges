package com.lc.codility.challenges.strings.reverseWords;

import com.lc.codility.challenges.strings.reverseWords.solutions.ReverseWords;

public class ReverseWordsMain {

    public static void main(String[] args) {

        ReverseWords reverseWords = new ReverseWords();
        String testString ="mali mali";
        System.out.println("for " + testString + " result is: " +reverseWords.reverse(testString));
        System.out.println("for " + testString + " result is: " +reverseWords.reverseByStringBuilder(testString));
    }
}
