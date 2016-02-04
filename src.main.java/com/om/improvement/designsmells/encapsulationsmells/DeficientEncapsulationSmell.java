/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.designsmells.encapsulationsmells;

public class DeficientEncapsulationSmell
{
    // This is called "Deficient encapsulation", the smell occurs if one or more members are given more visibility than required.
    public String name;
    
    public String getName()
    {
        return name;
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
