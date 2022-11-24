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

	public static void main(String[] args) {
		BinaryTreeExam tree = new BinaryTreeExam();
		tree.insert(56); // root
		tree.insert(30); // root.left
		tree.insert(70); // root.right

		tree.inOrder(tree.root); // retrieving values in ascending order.

	}
}