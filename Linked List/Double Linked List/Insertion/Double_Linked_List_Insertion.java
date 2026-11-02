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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position for the node to be inserted:");
        int position = sc.nextInt();
        dll.insertionAtFirst("Hello hello");
        dll.insertionAtLast("Test test");
        dll.insertionAtLast("Test test 4");
        dll.insertionAtSpecificPosition("Test test 2", position);
        dll.printList();
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

    // Insertion of node at a specific position
    public void insertionAtSpecificPosition(String data, int pos) {
        Node newNode = new Node(data);
        if(head == null) {
            System.out.println("The Double Linked List is empty");
            return;
        }
        if(pos == 1) {
            insertionAtFirst(data);
            return;
        }
        Node currentNode = head;
        for(int i = 1; i < pos - 1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        newNode.previous = currentNode;
        currentNode.next.previous = newNode;
    }


    // Insertion of node at last
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



    // Print the Double Linked List
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
