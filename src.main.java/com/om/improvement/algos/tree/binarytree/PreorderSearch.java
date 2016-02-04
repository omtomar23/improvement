/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos.tree.binarytree;

import java.util.Stack;

import com.om.improvement.algos.Node;

/**
 * Node-->Left-->Right
 */
public class PreorderSearch
{
    public void traverse(Node<Integer> node)
    {
        if (node != null)
        {
            System.out.print(" " + node.getElement());
            traverse(node.getFirst());
            traverse(node.getNext());
        }
        
    }
    
    public void traverse1(Node<Integer> node)
    {
        Stack<Node<Integer>> stack = new Stack<Node<Integer>>();
        if (node != null)
            stack.push(node);
        while (!stack.isEmpty())
        {
            Node<Integer> temp = stack.pop();
            System.out.print(" " + temp.getElement());
            if (temp.getNext() != null)
                stack.push(temp.getNext());
            if (temp.getFirst() != null)
                stack.push(temp.getFirst());
        }
        System.out.println();
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
        
        PreorderSearch preorderSearch = new PreorderSearch();
        preorderSearch.traverse(node50);
        System.out.println();
        preorderSearch.traverse1(node50);
        
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
