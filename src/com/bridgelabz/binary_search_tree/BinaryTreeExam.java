package com.bridgelabz.binary_search_tree;

import com.bridgelabz.binary_search_tree.BinaryTreeExam;

public class BinaryTreeExam {
	private TreeNode root;

	private class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public void insert(int value) {
		root = insert(root, value);
	}

	public TreeNode insert(TreeNode root, int value) {
		if (root == null || root.data == value) {
			root = new TreeNode(value);
			return root;
		}
		if (value < root.data) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}

	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	int size() {
		return size(root);
	}

	int size(TreeNode root) {
		if (root == null)
			return 0;// if tree is empty then return zero
		else
			return (size(root.left) + 1 + size(root.right));// 1 to add the root of the binary tree
															// and traversing the left and right of the bst
	}

	public void search(int key) {
		if (search(root, key) == null) {
			System.out.println("Node is not present in the BST");
		} else {
			System.out.println("Node found in the BST");
		}
	}

	public TreeNode search(TreeNode root, int key) {
		if (root == null || root.data == key) {
			return root;
		}
		if (key < root.data) {
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}
	}

	public static void main(String[] args) {
		BinaryTreeExam tree = new BinaryTreeExam();
		tree.insert(56); // root
		tree.insert(30);
		tree.insert(22);
		tree.insert(40);
		tree.insert(11);
		tree.insert(3);
		tree.insert(16);
		tree.insert(70);
		tree.insert(60);
		tree.insert(95);
		tree.insert(65);
		tree.insert(63);
		tree.insert(67);
		tree.inOrder(tree.root);// retrieving values in ascending order.
		System.out.println();
		System.out.println("Size of the tree is: " + tree.size());
		tree.search(35);
	}
}