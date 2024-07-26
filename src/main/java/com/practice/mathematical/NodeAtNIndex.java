package com.practice.mathematical;

public class NodeAtNIndex {

    static int getNthNode(Node3 node, int index){
        Node3 curr = node;
        int num = 1;
        while (curr != null){
            if(num == index)
                return curr.data;
            else{
                num ++;
                curr = curr.next;
            }
        }
        return -1;
    }

}

class Node3 {
    int data;
    Node3 next;

    Node3(int data){
        this.data = data;
        next = null;
    }
}
