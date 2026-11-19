import java.util.*;

public class Circular_Double_Linked_List_Deletion {
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
        Circular_Double_Linked_List_Deletion ll = new Circular_Double_Linked_List_Deletion();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position of node to delete: ");
        int position = sc.nextInt();
        ll.insertAtFirst("Hello hello");
        ll.insertAtLast("Test test 02");
        ll.insertAtLast("Test test 04");
        ll.printList();
        // ll.deletionAtFirst();
        // ll.deletionAtLast();
        ll.deletionAtSpecificPosition(position);
        ll.printList();
    }

    public void insertAtFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            System.out.println("The Linked List is empty. Inserting first node.");
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        newNode.previous = tail;
        head = newNode;
        head.previous = tail;
        tail.next = head;
    }

    public void insertAtLast(String data) {
        if(head == null) {
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        tail.next = head;
        head.previous = tail;
    }




    // Deletion of first Node from Circular Double Linked List
    public void deletionAtFirst() {
        if(head == null) {
            System.out.println("The Circular Double Linked List is empty.");
        }
        head = head.next;
        head.previous = tail;
        tail.next = head;
    }

    // Deletion of Last Node form the Circular Double Linked List
    public void deletionAtLast() {
        Node currentNode = tail;
        if(head == null) {
            System.out.println("The Circular Double Linked List is empty.");
        }
        tail = currentNode.previous;
        tail.next = head;
        head.previous = tail;
    }

    // Deletion of Node from Specific Position
    public void deletionAtSpecificPosition(int pos) {
        if(head == null) {
            System.out.print("The Circular Double Linked List is empty.");
        }
        if(pos == 1) {
            deletionAtFirst();
        }
        Node givenNode = head.next;
        Node previousNode = head;
        for(int i = 0; i < pos - 1; i++) {
            givenNode = givenNode.next;
            previousNode = previousNode.next;
        }
        givenNode.previous = previousNode.previous;
        previousNode.previous.next = givenNode;
    }
    public void printList() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " <-> ");
            currentNode = currentNode.next;
            if(currentNode == tail.next) {
                System.out.print(head.data);
                break;
            }
        }
        System.out.println();
    }
}
