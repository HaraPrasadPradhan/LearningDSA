import java.util.*;

public class Taking_Input_Linked_List {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Taking_Input_Linked_List list = new Taking_Input_Linked_List();
        System.out.println("Enter the number of nodes in the linked list:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the data for the node: ");
            int value = sc.nextInt();
            list.insert(value);
        }
        list.printList();
    }

    public void insert(int data) {
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
        Node currentNode;
        for(currentNode = head; currentNode != null; currentNode = currentNode.next) {
            System.out.print(currentNode.data + "-");
        }
        System.out.print("null");
    }
}
