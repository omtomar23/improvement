/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos.sorting;

import com.om.improvement.GeneralTools;

public class InsertionSort implements Sorting
{
    static int swapCount;
    
    public static final InsertionSort INSTANCE = new InsertionSort();
    
    public int[] sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i; j < arr.length; j++)
            {
                if (j != i)
                {
                    if (arr[i] > arr[j])
                    {
                        swapCount++;
                        GeneralTools.exchange(arr, i, j);
                    }
                }
            }
        }
        
        return arr;
    }
    
    public static int getSwapCountAndReset()
    {
        int localSwapCount = swapCount;
        swapCount = 0;
        return localSwapCount;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[] { 1, 3, 9, 8, 2, 7, 5 };
        INSTANCE.sort(arr);
        System.out.println("After sorting finished, swapCount=" + swapCount);
        GeneralTools.printArray(arr);
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
