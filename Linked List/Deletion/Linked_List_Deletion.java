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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of the node to delete: ");
        int position = sc.nextInt();
        list.insertAtFirst("Hello Hello");
        list.insertAtLast("Test test");
        list.insertAtLast("Test test 2");
        list.insertAtLast("Test test 4");
        list.printList();
        list.deletionAtSpecificPosition(position);
        // list.printList();
        // list.deletionAtFirst();
        // list.deletionAtLast();
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




    // Deletion of a node from a given position
    public void deletionAtSpecificPosition(int position) {
        if(head.next == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node previousNode = head;
        Node givenNode = head.next;

        for(int i = 1; i < position - 1; i++) {
            givenNode = givenNode.next;
            previousNode = previousNode.next;
        }
        previousNode.next = givenNode.next;
    }
}
