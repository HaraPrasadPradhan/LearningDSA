// Find Cycle in a Linked List
import java.util.*;

public class Find_Cycle_In_Linked_List {
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
        Find_Cycle_In_Linked_List ll = new Find_Cycle_In_Linked_List();
        ll.findCycle();
    }

    public void findCycle() {
        if(head == null || head.next == null) {
            System.out.println("No cycle found in the linked list.");
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                System.out.println("Cycle found in the linked list.");
                return;
            }
        }
        System.out.println("No cycle found in the linked list.");
        return;
    }
}
