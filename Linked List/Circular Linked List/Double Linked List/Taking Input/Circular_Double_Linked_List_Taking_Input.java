import java.util.*;

public class Circular_Double_Linked_List_Taking_Input {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;
        Node previous;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    public static void main(String[] args) {
        Circular_Double_Linked_List_Taking_Input ll = new Circular_Double_Linked_List_Taking_Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the length of the Circular Double Linked List: ");
        int length = sc.nextInt();
        for(int i = 0; i < length; i++) {
            System.out.println("Enter the data for the Circular Double Linked List: ");
            int value = sc.nextInt();
            ll.insert(value);
        }
        ll.printList();
        sc.close();
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
        head.previous = tail;
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
    }
}

