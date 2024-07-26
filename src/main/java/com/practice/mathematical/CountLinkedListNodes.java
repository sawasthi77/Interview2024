package com.practice.mathematical;

public class CountLinkedListNodes {

    static void countNodes(Node2 nodes){
        Node2 temp = nodes;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }


}
class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        next = null;
    }
}
