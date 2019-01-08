package com.lc.codility.challenges.numerics.reverseNumbers.solutions;

public class ReverseNumber {

    //Algorithm Complexity Analysis: O(N)
    public int reverse(int input) {
        int result = 0;
        int rem;
        while (input > 0) {
            rem = input % 10;
            input = input / 10;
            result = result * 10 + rem;
        }
        return result;
    }
}
