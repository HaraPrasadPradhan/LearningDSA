import java.util.*;

public class Linked_List_Deletion {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        Linked_List_Deletion list = new Linked_List_Deletion();
        list.insertAtFirst("Hello Hello");
        list.insertAtLast("Test test");
        list.insertAtLast("Test test 2");
        list.insertAtLast("Test test 4");
        list.printList();
        list.deletionAtFirst();
        list.deletionAtLast();
        list.printList();
    }
    public void insertAtFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void insertAtLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void printList() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + "-");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }












    // Deletion of First Node of the Linked List
    public void deletionAtFirst(){
        if(head == null) {
            System.out.print("Linked List is empty");
            return;
        }
        head = head.next;
    }


    // Deletion of the Last Node of the Linked List
    public void deletionAtLast() {
        if(head == null) {
            System.out.print("Linked List is empty");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }
}
