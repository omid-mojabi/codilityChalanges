package com.lc.codility.challenges.strings.compressStrings;

import com.lc.codility.challenges.strings.compressStrings.solutions.CompressString;

public class CompressStringMain {

    public static void main(String[] args) {
        CompressString compression = new CompressString();
        String stream = "aabghyftftcfcbbccc";
        System.out.println("compress string='" + stream + "' is: " + compression.compress(stream));
    }
}
