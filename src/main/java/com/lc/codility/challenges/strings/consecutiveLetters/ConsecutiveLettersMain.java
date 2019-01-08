package com.lc.codility.challenges.strings.consecutiveLetters;

import com.lc.codility.challenges.strings.consecutiveLetters.solutions.ConsLettersSolution;

public class ConsecutiveLettersMain {

    public static void main(String[] args) {
        ConsLettersSolution lettersSolution = new ConsLettersSolution();
        int countOfA = 1;
        int countOfB = 15;

        System.out.println("for count of a=" + countOfA + " and for count of b=" + countOfB +
                " result is: " + lettersSolution.solution(countOfA, countOfB));
    }
}
