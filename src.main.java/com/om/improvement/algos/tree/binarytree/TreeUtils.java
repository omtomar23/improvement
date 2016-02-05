package com.om.improvement.algos.tree.binarytree;

import java.util.List;

import com.om.improvement.algos.Node;

public class TreeUtils {
	private TreeUtils(){}
	
	  public static void printTreeNode(List<Node<Integer>> nodes)
	  {
	    	for (Node<Integer> node : nodes) 
	    	{
				System.out.print(node.getElement() +" ,");
			}
	    	System.out.println();
	  }
	  
	public static Node<Integer> createDummyTree() 
	{
		Node<Integer> node10 = new Node<Integer>(null, 10, null);
		Node<Integer> node1 = new Node<Integer>(null, 1, node10);
        Node<Integer> node12 = new Node<Integer>(null, 12, null);
        
        Node<Integer> node25 = new Node<Integer>(node1, 25, node12);
        
        Node<Integer> node62 = new Node<Integer>(null, 62, null);
        Node<Integer> node100 = new Node<Integer>(null, 100, null);
        
        Node<Integer> node75 = new Node<Integer>(node62, 75, node100);
        
        Node<Integer> node50 = new Node<Integer>(node25, 50, node75);
		return node50;
	}
}
