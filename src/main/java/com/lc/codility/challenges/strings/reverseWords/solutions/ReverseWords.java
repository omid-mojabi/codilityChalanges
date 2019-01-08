package com.lc.codility.challenges.strings.reverseWords.solutions;

public class ReverseWords {

    /**
     * Algorithm Complexity Analysis: O(N)
     */
    public String reverse(String inputStr) {
        String resultStr = "";
        for (int i = inputStr.length(); i > 0; i--) {
            resultStr = resultStr + inputStr.substring(i - 1, i);
        }

        return resultStr;
    }

    public String reverseByStringBuilder(String input){
        if(input == null || input.length() == 0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(int i =input.length()-1; i  >= 0; i--){
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
