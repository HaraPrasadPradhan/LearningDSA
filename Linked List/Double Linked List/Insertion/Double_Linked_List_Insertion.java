import java.util.*;

public class Double_Linked_List_Insertion {
    Node head;
    Node tail;
    class Node {
        String data;
        Node next;
        Node previous;
        Node(String data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    public static void main(String[] args) {
        Double_Linked_List_Insertion dll = new Double_Linked_List_Insertion();
        dll.insertionAtFirst("Hello hello");
    }
    // Insertion of node at first
    public void insertionAtFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }
}
