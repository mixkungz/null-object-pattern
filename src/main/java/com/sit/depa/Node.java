package com.sit.depa;

public class Node<Integer> {
    java.lang.Integer t;
    Node<Integer> leftNode;
    Node<Integer> rightNode;

    public Node(){}

    public Node(java.lang.Integer t){
        this.t = t;
    }

    public void add(java.lang.Integer t){
        if(this.t == null) {
            this.t = t;
        }
        if(this.t > t) {
            if(leftNode == null) {
                Node newNode = new Node(t);
                this.leftNode = newNode;
            } else {
                leftNode.add(t);
            }
        } else if (this.t < t) {
            if(rightNode == null) {
                Node newNode = new Node(t);
                this.rightNode = newNode;
            } else {
                rightNode.add(t);
            }
        }
    }

}
