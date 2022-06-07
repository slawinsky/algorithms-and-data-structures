package data.structures;

import org.w3c.dom.Node;

//TODO

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        return list;
    }

    public static void print(LinkedList list) {
        Node currNode = list.head;
        System.out.println("LinkedList: ");
        while(currNode != null) {
            System.out.print(currNode + " ");
            currNode = currNode.next;
        }
    }
}
