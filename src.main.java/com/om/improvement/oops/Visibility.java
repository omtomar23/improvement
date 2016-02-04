/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.oops;

public class Visibility
{
    public void display(String arg)
    {
        System.out.println("String");
    }
    
    public void display(Object arg)
    {
        System.out.println("Object");
    }
    
    public static void main(String[] args)
    {
        Visibility visibility = new Visibility();
        visibility.display(null);
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
