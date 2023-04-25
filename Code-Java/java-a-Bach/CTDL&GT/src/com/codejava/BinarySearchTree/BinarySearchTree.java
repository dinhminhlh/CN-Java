package com.codejava.BinarySearchTree;

import java.util.Iterator;

public class BinarySearchTree<T extends Comparable<T>> implements TreeADT<T>{
	private int nodeCount=0;
	private Node<T> root = null;
	@Override
	public boolean isEmpty() {
		return size()==0; 	//size ==0 thi tra ve true
	}

	@Override
	public int size() {
		return nodeCount;
	}

	@Override
	public int height() {
		return height(root);
	}

	@Override
	public boolean contains(T elem) {
		return contains(root, elem);
	}

	@Override
	public boolean add(T elem) {
		if(contains(elem)) return false;
		root = add(root, elem);
		return true;
	}

	@Override
	public boolean remove(T elem) {
		if(!contains(elem)) return false;
		root = remove(root, elem);
		nodeCount--;
		return true;
	}

	@Override
	public Iterator<T> traverse(TreeTraverseType type) {
		return null;
	}
	
	private int height(Node<T> node) {
		if(node==null)  return 0;
		return 1 + Math.max(height(node.getLeft()), height(node.getRight()));   //???
	}
	
	private boolean contains(Node<T> node, T elem) {
		if(node == null) {
			return false;
		}
		int result = elem.compareTo(node.getData());
		if(result<0) return contains(node.getLeft(), elem);
		else if(result > 0) return contains(node.getRight(), elem);
		else return true;
	}
	private Node<T> add(Node<T> node, T elem) {
		if(node == null) {
			node = new Node<T>(elem);
		}
		else {
			if(elem.compareTo(node.getData()) > 0) {
				node.setRight(add(node.getRight(), elem));
			}
			else {
				node.setLeft(add(node.getLeft(), elem));
			}
		}
		return node;
	}
	private Node<T> remove(Node<T> node, T elem){
		int result = elem.compareTo(node.getData());
		if(result>0) {
			node.setRight(remove(node.getRight(), elem));
		}
		else if(result<0){
			node.setLeft(remove(node.getLeft(), elem));
		}
		else {
			if(node.getLeft()==null) {
				Node<T> rightNode = node.getRight();
				
				node.setData(null);
				node=null;
				return rightNode;
			}
			else if(node.getRight() == null) {
				Node<T> leftNode = node.getLeft();
				
				node.setData(null);
				node = null;
				
				return leftNode;
			}
			else {
				T tmp = minRight(node);
				
				node.setData(tmp);
				
				node.setRight(remove(node.getRight(), tmp));
			}
		}
		return node;
	}
	private T minRight(Node<T> node) {
		while(node.getLeft() != null) {
			node= node.getLeft();
		}
		return node.getData();
	}

}



















