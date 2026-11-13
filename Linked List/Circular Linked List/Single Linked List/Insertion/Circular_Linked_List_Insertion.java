import java.util.*;

public class Circular_Linked_List_Insertion {
    Node head;
    Node tail;
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position where you want to insert the node: ");
        int position = sc.nextInt();
        System.out.println("Insert the data for the node: ");
        String value = sc.next();
        Circular_Linked_List_Insertion ll = new Circular_Linked_List_Insertion();
        ll.insertAtFirst("Hello hello");
        ll.insertAtLast("Test test");
        ll.insertAtLast("Test test 02");
        ll.insertAtLast("Test test 04");
        ll.insertAtSpecificPosition(value, position);
        ll.printList();
    }

    
    // Insertion of node at first in a Circular Linked List
    public void insertAtFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            System.out.println("The Circular Linked List is empty. Inserting the first node.");
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }
    
    // Insertion of node at a specific position in a Circular Linked List
    public void insertAtSpecificPosition(String data, int Position) {
        Node newNode = new Node(data);
        if(head == null) {
            System.out.println("The Circular Linked List is empty. Inserting the first node.");
            head = tail = newNode;
            return;
        }
        Node currentNode = head;
        for(int i = 1; i < Position - 1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }
    // Insertion of node at last in a Circular Linked List
    public void insertAtLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            System.out.println("The Circular Linked List is empty.");
            insertAtFirst(data);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }
    
    // Print the circular linked list
    public void printList() {
        if(head == null) {
            System.out.println("The Circular Linked List is empty.");
            return;
        }
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " <-> ");
            currentNode = currentNode.next;
            if(currentNode == tail.next) {
                System.out.print(head.data);
                break;
            }
        }
    }
}
