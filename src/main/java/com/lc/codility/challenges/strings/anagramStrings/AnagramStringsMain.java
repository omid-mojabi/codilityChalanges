package com.lc.codility.challenges.strings.anagramStrings;

import com.lc.codility.challenges.strings.anagramStrings.solutions.AnagramStrings;

public class AnagramStringsMain {

    public static void main(String[] args) {
        AnagramStrings anagramStrings = new AnagramStrings();
        //String str1 = "geeksforgeeks"; String str2 = "forgeeksgeeks";
        String str1 = "listen"; String str2 = "silent";
        //String str1 = "triangle"; String str2 = "integral";
        //String str1 = "omid"; String str2 = "navid";

        if (anagramStrings.areAnagram(str1.toCharArray(), str2.toCharArray()))
            System.out.println("The two strings '" + str1 + "' and '" + str2 + "' are anagram of each other");
        else
            System.out.println("The two strings '" + str1 + "' and '" + str2 + "' are not anagram of each other");

    }
}
