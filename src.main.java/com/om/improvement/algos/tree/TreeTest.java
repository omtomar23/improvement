/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos.tree;

import java.util.List;

import com.om.improvement.algos.Node;
import com.om.improvement.algos.tree.binarytree.TreeManager;
import com.om.improvement.algos.tree.binarytree.TreeUtils;

public class TreeTest
{
    public static void main(String[] args) {
    	TreeManager<Integer> treeManager = new TreeManager<Integer>();
    	List<Node<Integer>> preOrders = treeManager.getPreOrderFromRec(TreeUtils.createDummyTree());
    	TreeUtils.printTreeNode(preOrders);
    	
    	List<Node<Integer>> inOrders = treeManager.getPostOrderFromRec(TreeUtils.createDummyTree());
    	TreeUtils.printTreeNode(inOrders);
    	
    	List<Node<Integer>> zigZagTravers = treeManager.zigZagTravers(TreeUtils.createDummyTree());
    	TreeUtils.printTreeNode(zigZagTravers);
	}
}


/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 *
 * R8
 */
