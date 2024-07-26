package com.practice.mathematical;

public class LinkedListPrint {

    public static void main(String[] args) {
        display(new Node(1));
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
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
