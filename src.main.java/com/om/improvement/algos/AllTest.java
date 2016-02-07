/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos;

public class AllTest
{
    public static void main(String[] args)
    {
        int missingNumber = AlgoTools.getMissingNoInNaturalNumberArray(new int[]{1,2,3,5}, 5);
        System.out.println("Missing number="+ missingNumber);
        
        AlgoTools.printTopTwoElement(new int[]{1,3,4,5,6,7});
        
        System.out.println(StringTools.reverse("abc"));
        
        System.out.println(StringTools.removeConsecutiveCharaters("aaaah"));
        System.out.println("Is Palindrome="+ StringTools.isPalindrome("a"));
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
