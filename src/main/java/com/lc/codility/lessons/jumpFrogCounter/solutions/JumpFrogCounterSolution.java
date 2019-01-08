package com.lc.codility.lessons.jumpFrogCounter.solutions;

import com.lc.codility.lessons.utils.JumpFrogCounter;

public class JumpFrogCounterSolution {

    public int solution(int X, int Y, int D) {
        JumpFrogCounter jumpFrogCounter = new JumpFrogCounter();
        return jumpFrogCounter.jumps(X,Y,D);
    }
}
