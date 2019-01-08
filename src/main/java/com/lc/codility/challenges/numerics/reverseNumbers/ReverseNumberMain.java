package com.lc.codility.challenges.numerics.reverseNumbers;

import com.lc.codility.challenges.numerics.reverseNumbers.solutions.ReverseNumber;

public class ReverseNumberMain {

    public static void main(String[] args) {

        ReverseNumber reverseNumber = new ReverseNumber();
        int input = 743;
        System.out.println("The reversed number="+input+" is: " + reverseNumber.reverse(input));
    }
}
