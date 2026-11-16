import java.util.*;

public class Circular_Linked_List_Deletion {
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


    public static void main(String[] args) {
        Circular_Linked_List_Deletion ll = new Circular_Linked_List_Deletion();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position where you want to delete the node: ");
        int pos = sc.nextInt();
        ll.insertAtFirst("Hello hello");
        ll.insertAtLast("Test test 02");
        ll.insertAtLast("Test test 04");
        ll.insertAtLast("Test test");
        ll.printList();
        // ll.deleteAtFirst();
        // ll.deleteAtLast();
        ll.deleteAtSpecificPosition(pos);
        ll.printList();
    }

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

    // Print the Circular Linked List
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
        System.out.println();
    }

    // Deletion of node at first
    public void deleteAtFirst() {
        if(head == null) {
            System.out.println("The Circular Linked List is empty.");
            return;
        }
        if(head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        tail.next = head;
    }


    // Deletion of node at last
    public void deleteAtLast() {
        if(head == null) {
            System.out.println("The Circular Linked List is empty.");
            return;
        }
        if(head == tail) {
            head = tail = null;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != tail) {
            currentNode = currentNode.next;
        }
        currentNode.next = head;
        tail = currentNode;
    }

    // Deletion of node at a specific position
    public void deleteAtSpecificPosition(int Position) {
        if(head == null) {
            System.out.println("The Circular Linked List is empty.");
            return;
        }
        if(Position == 1) {
            deleteAtFirst();
            return;
        }
        Node currentNode = head;
        for(int i = 1; i < Position - 1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
    }
}
