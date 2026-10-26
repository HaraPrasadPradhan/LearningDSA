import java.util.*;

public class Linked_List_Insertion {
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
        Linked_List_Insertion list = new Linked_List_Insertion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position to insert a new node:");
        int position = sc.nextInt();
        list.insertAtFirst("Hello Hello");
        list.insertionAtLast("Test test");
        list.insertAtSpecificPostion("Test 4", position);
        list.printList();
    }


    // Insertion of a new node at the first position of the linked list
    public void insertAtFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }




    // Insertion of a new node at the last position of the linked list
    public void insertionAtLast(String data) {
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








    
    // Taking input at a specific position in the linked list
    public void insertAtSpecificPostion(String data, int position) {
        Node newNode = new Node(data);
        if(head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        if(position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currentNode = head;
        for(int i = 0; i < position - 1; i++) {
            if(currentNode.next == null) {
                System.out.println("The position is out of bounds");
                return;
            }
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }


    // Print all the nodes of the linked list
    public void printList() {
        if(head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + "-");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}
