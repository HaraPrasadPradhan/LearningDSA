import java.util.*;

public class Double_Linked_List_Deletion {
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the specific position to delete the node:");
        int position = sc.nextInt();
        Double_Linked_List_Deletion dll = new Double_Linked_List_Deletion();
        dll.insertionAtFirst("Hello hello");
        dll.insertionAtLast("Test test");
        dll.insertionAtLast("Test test 2");
        dll.insertionAtLast("Test test 4");
        // dll.deletionAtFirst();
        // dll.deletionAtLast();
        dll.deletionAtSpecificPosition(position);
        // dll.deletionOfEntireList();
        dll.printList();
    }

    public void insertionAtFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        newNode = head;
    }

    public void insertionAtLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    // Deletion of tail node
    public void deletionAtLast() {
        if(head == null) {
            System.out.println("The Double Linked List is empty");
            return;
        }
        tail = tail.previous;
        tail.next = null;
    }

    // Deltion of node at a specific position
    public void deletionAtSpecificPosition(int pos) {
        if(head == null) {
            System.out.print("The Double Linked List is empty");
            return;
        }
        if(pos == 1) {
            deletionAtFirst();
            return;
        }
        Node givenNode = head.next;
        Node previousNode = head;
        for(int i = 1; i < pos - 1; i++) {
            givenNode = givenNode.next;
            previousNode = previousNode.next;
        }
        givenNode.next.previous = previousNode;
        previousNode.next = givenNode.next;
    }

    // Deletion of node at first
    public void deletionAtFirst() {
        if(head == null) {
            System.out.println("The Double Linked List is empty");
            return;
        }
        if(head.next == null) {
            head = tail = null;
            // System.out.print("The Double Linked List is empty");
            return;
        }
        head = head.next;
        head.previous = null;
    }

    // Deletion of entire Double Linked List
    public void deletionOfEntireList() {
        Node currentNode = head;
        while(currentNode != null) {
            Node newNode = currentNode.next;
            currentNode.previous = null;
            currentNode.next = null;
            currentNode = newNode;
        }
        head = tail = null;
    }

    public void printList() {
        Node currentNode = head;
        if(head == null) {
            System.out.println("The Double Linked List is empty");
            return;
        }
        while(currentNode != null) {
            System.out.print(currentNode.data + " <-> ");
            currentNode = currentNode.next; 
        }
        System.out.print("null");
    }
}
