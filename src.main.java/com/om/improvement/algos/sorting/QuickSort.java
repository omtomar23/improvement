/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos.sorting;

import com.om.improvement.GeneralTools;

public class QuickSort implements ISort
{
    static int swapCount;
    public static final QuickSort INSTANCE = new QuickSort();
    
    private QuickSort()
    {
    }
    
    public int[] sort(int[] arr)
    {
        sort(arr, 0, arr.length);
        return arr;
    }
    
    private void sort(int[] arr, int pivotElementIndex, int subArrLength)
    {
        if (pivotElementIndex < subArrLength)
        {
            int q = getPartition(arr, pivotElementIndex, subArrLength);
            sort(arr, pivotElementIndex, q);
            sort(arr, q + 1, subArrLength);
        }
    }
    
    private int getPartition(int[] arr, int pivotElementIndex, int subArrLength)
    {
        int pivotElement = arr[pivotElementIndex];
        int j = subArrLength - 1;
        int i = pivotElementIndex;
        while (true)
        {
            for (; j >= 0;)
            {
                if (arr[j--] <= pivotElement)
                {
                    break;
                }
            }
            
            for (; i < subArrLength;)
            {
                if (arr[i++] >= pivotElement)
                {
                    break;
                }
            }
            
            if (i < j)
            {
                swapCount++;
                GeneralTools.exchange(arr, i, j);
            }
            else
            {
                return j;
            }
        }
        
    }
    
    public int getSwapCountAndReset()
    {
        int localSwapCount = swapCount;
        swapCount = 0;
        return localSwapCount;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[] { 1, 1, 1, 1, 1, 1, 1 };
        INSTANCE.sort(arr, 0, 7);
        
        System.out.println("After sorting finished, swapCount=" + swapCount);
        GeneralTools.printArray(arr);
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
