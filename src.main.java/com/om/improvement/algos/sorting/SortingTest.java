/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos.sorting;

import com.om.improvement.TimeMonitor;

public class SortingTest
{
    public static void main(String[] args)
    {
        int arr1[] = new int[99999];
        int arr2[] = new int[99999];
        int arr3[] = new int[99999];
        for (int i = 99999 - 1; i >= 0; i--)
        {
            arr1[i] = i * 16 % 99;
            arr2[i] = i * 16 % 99;
            arr3[i] = i * 16 % 99;
        }
        System.out.println("Sorting started");
        
        // TimeMonitor quickSortTimer = new TimeMonitor();
        // SortingRunner quickRunner = new SortingRunner(quickSortTimer, QuickSort.INSTANCE);
        // quickRunner.sort(arr1);
        // System.out.println("Time taken by quick sort=" + quickSortTimer.getTakenTimeInMillis());
        
        TimeMonitor insertionSort = new TimeMonitor();
        SortingRunner insertionRunner = new SortingRunner(insertionSort, InsertionSort.INSTANCE);
        insertionRunner.sort(arr2);
        System.out.println("Time taken by insertion sort=" + insertionSort.getTakenTimeInMillis());
        
        TimeMonitor countingSort = new TimeMonitor();
        SortingRunner countingRunner = new SortingRunner(countingSort, CountingSort.INSTANCE);
        countingRunner.sort(arr3);
        System.out.println("Time taken by counting sort=" + countingSort.getTakenTimeInMillis());
        
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
