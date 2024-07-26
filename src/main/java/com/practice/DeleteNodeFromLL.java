package com.practice;

public class DeleteNodeFromLL {

    static Node deleteNode(Node head, int x){
        Node temp = head;
        if( x == 1){
            head = temp.next;
            return head;
        }
        for( int i = 1; i < x - 1 && temp !=null ; i++){
            temp = temp.next;
        }
        if(temp == null && temp.next == null){
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }
}

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
