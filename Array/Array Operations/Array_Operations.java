import java.util.Scanner;
public class Array_Operations {
    public static void main(String arg[]) {
        int arr[] = new int[4];
        int size = 4;
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;




        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the new value to replace at first:");
        int value = sc.nextInt();
        System.out.println("Enter the positon to replace the element:");
        int pos = sc.nextInt();
        // traverseArray(arr, size);
        //replaceFirstElement(arr, size, value);
        // insertAtBeginning(arr, size, value);
        // deleteFirstElement(arr, size);
        // replaceElementAtPosition(arr, size, pos, value);
        // insertElementAtPosition(arr, size, pos, value);
        // deleteLastElement(arr, size);
        deleteElementAtPosition(arr, size, pos);
        sc.close();
    }

    
    //Simple array traversal function.
    static void traverseArray( int arr[], int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //Replace the element at the beginning of the array.
    static void replaceFirstElement(int arr[], int size, int newElement) {
        if(size <= 0) {
            System.out.println("Array is empty.");
        } else {
            arr[0] = newElement;
        }
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //Insert the element at the beginning of the array without and keep the rest of the element on order.
    static void insertAtBeginning(int arr[], int size, int newElement) {
        if(size <= 0) {
            System.out.println("Array is empty.");
        } else {
            for(int i = size - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = newElement;
        }
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    // Replace the element at specific position of the array.
    static void replaceElementAtPosition(int arr[], int size, int position, int newElement) {
        if(size <= 0) {
            System.out.println("Array is empty");
        } else if(position < 0 || position >= size) {
            System.out.println("Position is incorrect.");
        } else {
            arr[position] = newElement;
        }
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //Insert the element at specific position of the array and keep the rest of the element on order.
    static void insertElementAtPosition(int arr[], int size, int position, int newElement) {
        if(size <= 0) {
            System.out.println("Array is empty.");
        } else if(position < 0 || position >= size) {
            System.out.println("Position is incorrect.");
        } else {
            for(int i = size - 1; i >= position + 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[position] = newElement;
        }
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //Delete the first element of the array.
    static void deleteFirstElement(int arr[], int size) {
        if(size < 0) {
            System.out.println("Array is empty.");
        } else {
            for(int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        }
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //Delete the last element of the array.
    static void deleteLastElement(int arr[], int size) {
        if(size < 0) {
            System.out.println("Array is empty.");
        }
        arr[arr.length - 1] = 0;
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //Delete the element at specific position of the array.
    static void deleteElementAtPosition(int arr[], int size, int position) {
        if(size < 0) {
            System.out.println("Array is empty.");
        } else if(position < 0 || position >= size) {
            System.out.println("Position is incorrect.");
        } else {
            for(int i = position; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        }
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}