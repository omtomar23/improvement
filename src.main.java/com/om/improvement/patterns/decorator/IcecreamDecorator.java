/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.patterns.decorator;

public abstract class IcecreamDecorator implements Icecream
{
    protected Icecream iceCream;
    
    public IcecreamDecorator(Icecream specialIcecream)
    {
        this.iceCream = specialIcecream;
    }
    
}

/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED
 * R8
 */
