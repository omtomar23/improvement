/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.patterns.decorator;

public class NuttyDecorator extends IcecreamDecorator
{
    public NuttyDecorator(Icecream specialIcecream)
    {
        super(specialIcecream);
    }
    
    @Override
    public String makeIcecream()
    {
        return iceCream.makeIcecream() + addNuts();
    }
    
    private String addNuts()
    {
        return " + cruncy nuts";
    }
}

/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED
 * R8
 */
