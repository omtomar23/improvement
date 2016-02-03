/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos.sorting;

import com.om.improvement.GeneralTools;

/**
 * 
 */
public class CountingSort implements Sorting
{
    public static final CountingSort INSTANCE = new CountingSort();
    
    public int[] sort(int[] a)
    {
        return sort(a, GeneralTools.getMaxElement(a));
    }
    
    private int[] sort(int[] a, int k)
    {
        int[] b = new int[a.length];
        int[] c = new int[k + 1];
        
        // Count the element occurrences and store
        for (int j = 0; j < a.length; j++)
        {
            c[a[j]] = c[a[j]] + 1;
        }
        
        // Contains the number less then or equal to i
        for (int i = 1; i < c.length; i++)
        {
            c[i] = c[i] + c[i - 1];
        }
        
        for (int j = (a.length - 1); j >= 0; j--)
        {
            b[--c[a[j]]] = a[j];
        }
        return b;
    }
    
    private static void print(int[] a)
    {
        for (int i : a)
        {
            System.out.print(i + " ,");
        }
        System.out.println("");
    }
    
    public static void main(String[] args)
    {
        int[] a = new int[] { 3, 6, 4, 1, 3, 4, 1, 4 };
        System.out.println("Input:");
        print(a);
        System.out.println("Output:");
        print(INSTANCE.sort(a, 6));
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
