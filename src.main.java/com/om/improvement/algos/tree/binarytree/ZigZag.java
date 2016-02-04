/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos.tree.binarytree;

import com.om.improvement.algos.Node;

public class ZigZag
{
    public void zigZag(Node<Integer> head)
    {
        
    }
    
    public static void main(String[] args)
    {
        Node<Integer> node1 = new Node<Integer>(null, 1, null);
        Node<Integer> node12 = new Node<Integer>(null, 12, null);
        
        Node<Integer> node25 = new Node<Integer>(node1, 25, node12);
        
        Node<Integer> node62 = new Node<Integer>(null, 62, null);
        Node<Integer> node100 = new Node<Integer>(null, 100, null);
        
        Node<Integer> node75 = new Node<Integer>(node62, 75, node100);
        
        Node<Integer> node50 = new Node<Integer>(node25, 50, node75);
        
        ZigZag zigZag = new ZigZag();
        zigZag.zigZag(node50);
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
