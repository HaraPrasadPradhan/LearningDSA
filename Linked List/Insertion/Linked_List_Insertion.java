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
        list.insertAtFirst("Hello Hello");
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
}
