/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.designsmells.encapsulationsmells;

import java.util.ArrayList;
import java.util.List;

public class LeakyEncapsulationSmell
{
    // This is called "Leaky encapsulation", the smell occurs when an abstraction exposes implementation details via public interface.
    // Instead of reference , deep copy of object should be returned
    
    private List<String> userNames;
    
    LeakyEncapsulationSmell()
    {
        userNames = new ArrayList<String>();
    }
    
    public List<String> getUserNames()
    {
        return userNames;
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
