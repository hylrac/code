package com.sopra.pox3.structure;

import java.util.ArrayList;
import java.util.List;

public class Tree {

	Node root;

}

class Node {

	List<Branch> branches = new ArrayList<>();
	String value;

}

abstract class Branch {
	
	Node start;

}

class BranchWithNode extends Branch{
	Node end;
}

class BranchWithLeaf extends Branch{
	Leaf end;
}

class Leaf {
	String value;

}
