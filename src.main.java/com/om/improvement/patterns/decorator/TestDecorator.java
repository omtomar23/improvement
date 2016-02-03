/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.patterns.decorator;

public class TestDecorator
{
    public static void main(String[] args)
    {
        Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
        System.out.println(icecream.makeIcecream());
        
    }
}

/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED
 * R8
 */
