package com.lc.codility.utils;

public class BubbleSortImpl {

	//Algorithm Complexity Analysis: O(n2)
	public void bubble(int[] a)
    {
        int temp = 0;
        for(int i =a.length;i>=0; i--)
        {
            for(int j=0;j< i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
