package com.lc.codility.challenges.strings.consecutiveLetters.solutions;

import java.util.LinkedList;
import java.util.List;

public class ConsLettersSolution {

    /**
     * Algorithm Complexity Analysis: O(N)
     */
    public String solution(int A, int B) {

        List<String> result = new LinkedList<>();
        if (A == B) {
            for (int i = 0; i < A; i++) {
                result.add("ab");
            }
            return getString(result);
        }

        int bigger = A > B ? A : B;
        int smaller = A > B ? B : A;
        String biggerChar = A > B ? "a" : "b";
        String smallerChar = A > B ? "b" : "a";

        while (bigger > 0) {
            bigger = addItem(bigger, result, biggerChar);
            bigger = addItem(bigger, result, biggerChar);
            smaller = addItem(smaller, result, smallerChar);
        }

        smaller = addItem(smaller, result, smallerChar);

        smaller = addItem(smaller, 0, result, smallerChar);

        smaller = addItem(smaller, 2, result, smallerChar);

        int index = 2;
        while (smaller > 0) {
            index += 4;
            smaller = addItem(smaller, index, result, smallerChar);
        }

        return getString(result);

    }

    private int addItem(int capacity, int index, List<String> items, String data) {
        if (capacity > 0) {
            items.add(index, data);
            capacity--;
        }

        return capacity;
    }

    private int addItem(int capacity, List<String> items, String data) {
        if (capacity > 0) {
            items.add(data);
            capacity--;
        }

        return capacity;
    }

    private String getString(List<String> result) {
        StringBuilder s = new StringBuilder();
        for (String str : result) {
            s.append(str);
        }

        return s.toString();
    }

}
