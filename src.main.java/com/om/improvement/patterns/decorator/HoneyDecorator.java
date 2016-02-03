/*

 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.patterns.decorator;

public class HoneyDecorator extends IcecreamDecorator
{
    public HoneyDecorator(Icecream specialIcecream)
    {
        super(specialIcecream);
    }
    
    @Override
    public String makeIcecream()
    {
        return iceCream.makeIcecream() + addHoney();
    }
    
    private String addHoney()
    {
        return " + sweet honey";
    }
}

/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED
 * R8
 */
