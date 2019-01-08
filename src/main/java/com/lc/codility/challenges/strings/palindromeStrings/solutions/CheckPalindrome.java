package com.lc.codility.challenges.strings.palindromeStrings.solutions;

public class CheckPalindrome {

    /**
     * Algorithm Complexity Analysis: O(N)
     */
    public boolean isPalindrome(String str){

        if(str.isEmpty()) return true;

        int last = str.length() - 1;

        for(int i = 0; i <= last / 2;i++)
            if(str.charAt(i) != str.charAt(last - i))
                return false;

        return true;
    }

    public boolean isPalindromeRecursive(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            // if length =0 OR 1 then it is
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            // check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until you string completes or condition fails
            return isPalindromeRecursive(s.substring(1, s.length()-1));

        // if its not the case than string is not.
        return false;
    }

    public boolean isPalindromeUseStringBuffer(String str){
        return str.equals(new StringBuffer(str).reverse().toString());
    }
}
