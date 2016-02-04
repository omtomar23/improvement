/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.oops;

public class OverridingPreference
{
    public void display(long number)
    {
        System.out.println("long");
    }
    
    public void display(Integer number)
    {
        System.out.println("Integer");
    }
    
    public void display(int... numbers)
    {
        System.out.println("int...");
    }
    
    public static void main(String[] args)
    {
        OverridingPreference overridingPreference = new OverridingPreference();
        overridingPreference.display(5);
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
