package com.sit.depa;

public class Tree {

    public static void main(String[] args) {
        Node node = new Node();
        node.add(5);
        node.add(8);
        node.add(4);
        node.add(2);
        node.add(6);
        node.add(7);

        System.out.println(node.t);
        System.out.println(node.leftNode.t);
        System.out.println(node.rightNode.t);
        System.out.println(node.leftNode.leftNode.t);
    }
}
