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
        // traverseArray(arr, size);
        replaceFirstElement(arr, size, value);
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
}