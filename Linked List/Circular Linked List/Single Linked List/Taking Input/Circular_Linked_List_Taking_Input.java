import java.util.*;

public class Circular_Linked_List_Taking_Input {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        Circular_Linked_List_Taking_Input ll  = new Circular_Linked_List_Taking_Input(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the circular linked list: ");
        int length = sc.nextInt();
        for(int i = 0; i < length; i++) {
            System.out.println("Enter the value of the node: ");
            int value = sc.nextInt();
            ll.insertAtLast(value);
        }
        ll.printList();
        sc.close();
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            System.out.println("The Circular Linked List is empty. Inserting first");
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }



    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            System.out.println("The Circular Linked List is empty. Inserting the first node.");
            insertAtFirst(data);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
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
