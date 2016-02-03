/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement;

/**
 * Have general reusable tools.
 */
public class GeneralTools
{
    public static boolean oddOrNot(int num)
    {
        return (num & 1) != 0;
    }
    
    public static void exchange(int[] arr, int from, int to)
    {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
    
    public static void printArray(int[] ar)
    {
        for (int n : ar)
        {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
    
    public static void printArray(int[] ar, int lowerIdex, int upperIndex)
    {
        for (int i = lowerIdex; i <= upperIndex; i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println("");
    }
    
    public static int getMaxElement(int[] ar)
    {
        int element = 0;
        for (int i = 0, j = ar.length - 1; i < ar.length && j >= 0; i++, j--)
        {
            if (i > j)
                break;
            
            if (element < ar[i])
            {
                element = ar[i];
            }
            if (element < ar[j])
            {
                element = ar[j];
            }
        }
        
        return element;
    }
    
    public static void main(String[] args)
    {
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(oddOrNot(Integer.MAX_VALUE));
        // System.out.println(oddOrNot(Integer.MIN_VALUE));
        // System.out.println(oddOrNot(2));
        
        System.out.println(getMaxElement(new int[] { 1, 3, 9, 8, 2, 7, 5 }));
    }
    
}

/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED
 * R8
 */
