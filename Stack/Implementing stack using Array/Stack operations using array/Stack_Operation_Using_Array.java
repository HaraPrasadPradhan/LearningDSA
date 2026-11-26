import java.util.*;

public class Stack_Operation_Using_Array {
    // Array to store elements
    private int arr[];
    // Store the size of the array
    private int capacity;
    // Store the top of the stack
    private int top;
    // constructor of stack
    public Stack_Operation_Using_Array(int capa) {
        capacity = capa;
        arr = new int[capacity];
        top = -1;
    }
    public static void main(String args[]) {
        Stack_Operation_Using_Array list = new Stack_Operation_Using_Array(4);
        list.push(2);
        list.push(4);
        list.push(6);
        list.push(8);
        list.peek();
        list.pop();
        list.peek();
        list.isEmpty();
        list.isFull();
    }

    // Push Operation
    public void push(int element) {
        if(top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        ++top;
        arr[top] = element;
    }

    // Pop Operation
    public void pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        int removedElement = arr[top];
        --top;
    }
    // Peek Operation
    public void peek() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(arr[top]);
    }
    // isEmpty Opeartion
    public boolean isEmpty() {
        return top == -1;
    }
    // isFull Operation
    public boolean isFull() {
        return top == capacity - 1;
    }
}
