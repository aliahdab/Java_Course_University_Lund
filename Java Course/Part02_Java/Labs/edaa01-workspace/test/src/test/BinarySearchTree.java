package test;

public class BinarySearchTree<E extends Comparable<E>> {
	private Node<E> root;

	/** Skapar ett tomt binärt träd. */
	public BinarySearchTree() {
		root = null;
	}

	private static class Node<E> {
		private E element;
		private Node<E> left;
		private Node<E> right;

		private Node(E element) {
			this.element = element;
			left = null;
			right = null;
		}
	}

	public E deleteMin() {
		if (root == null) {
			return null;
		}
		E temp = null;
		if (root.left == null) {
			temp = root.element;
			root = root.right;
		} else {
			Node<E> pre = root;
			Node<E> p = root.left;
			while (p.left != null) {
				pre = p;
				p = p.left;
			}
			temp = p.element;
			pre.left = p.right;
		}
		return temp;
	}

}
