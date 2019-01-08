package com.lc.codility.lessons.utils;

public class JumpFrogCounter {

    //Algorithm Complexity Analysis: O(1)
    public int jumps(int X, int Y, int D) {
        int diff = Y - X;
        int count = diff / D;
        if (diff % D > 0) {
            count++;
        }
        return count;
    }
}
