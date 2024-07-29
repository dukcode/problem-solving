package com.dukcode.jongman.chap22_binary_search_tree;

import java.util.Random;

public class Treap {

  private static class NodePair {

    private Node left;
    private Node right;

    public NodePair(Node left, Node right) {
      this.left = left;
      this.right = right;
    }

    public Node getLeft() {
      return left;
    }

    public Node getRight() {
      return right;
    }
  }

  private static class Node {

    private int key;
    private int priority;
    private int size;

    private Node left;
    private Node right;

    public Node(int key) {
      this.key = key;
      this.priority = new Random().nextInt();
    }

    public void setLeft(Node left) {
      this.left = left;
      calcSize();
    }

    public void setRight(Node right) {
      this.right = right;
      calcSize();
    }

    private void calcSize() {
      this.size = 1;

      if (left != null) {
        this.size += left.size;
      }

      if (right != null) {
        this.size += right.size;
      }
    }

    public Node insert(Node node) {
      if (this.priority < node.priority) {
        NodePair splitted = split(node.key);
        node.setLeft(splitted.left);
        node.setRight(splitted.right);
        return node;
      }

      if (node.key < this.key) {
        this.left.insert(node);
        return this;
      }

      this.right.insert(node);
      return this;
    }

    private NodePair split(int key) {
      if (this.key < key) {
        if (this.right == null) {
          return new NodePair(null, null);
        }
        NodePair rs = this.right.split(key);
        this.setRight(rs.left);
        return new NodePair(this, rs.right);
      }

      if (this.left == null) {
        return new NodePair(null, null);
      }
      NodePair ls = this.left.split(key);
      this.setLeft(ls.right);
      return new NodePair(ls.left, this);
    }

  }

}
