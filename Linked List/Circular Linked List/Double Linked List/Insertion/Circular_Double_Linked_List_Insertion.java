import java.util.*;

public class Circular_Double_Linked_List_Insertion {
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
        Circular_Double_Linked_List_Insertion ll = new Circular_Double_Linked_List_Insertion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the specific position to insert the new node: ");
        int position = sc.nextInt();
        ll.insertAtFirst("Hello hello");
        ll.insertAtLast("Test test 02");
        ll.insertAtLast("Test test 04");
        ll.insertAtSpecificPosition("Test test", position);
        ll.printList();
        sc.close();
    }

    // Insert Node at First
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
    
    // Insert Node at Last
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
    
    // Insert node at specific position
    public void insertAtSpecificPosition(String data, int pos) {
        if(head == null) {
            insertAtFirst(data);
            return;
        }
        Node currentNode = head;
        Node newNode = new Node(data);
        for(int i = 1; i < pos - 1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        newNode.previous = currentNode;
    }
    
    // Print the Circular Double Linked List
    public void printList() {
        Node currentNode = head;
        if(head == null) {
            System.out.println("The Linked List is empty.");
            return;
        }
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
