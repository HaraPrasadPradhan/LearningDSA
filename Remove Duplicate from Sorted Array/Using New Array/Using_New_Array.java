import java.util.*;

public class Using_New_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the items of the array:");
            arr[i] = sc.nextInt();
        }


        int newArr[] = new int[arr.length];
        removeDuplicates(arr, newArr);
        sc.close();
    }
    static void removeDuplicates(int arr[], int newArr[]) {
        int x = 0;
        newArr[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[x] != arr[i]) {
                x++;
                newArr[x] = arr[i];
            }
        }
        for(int i = 0; i < newArr.length; i++) {
            System.out.println("The new array after removing duplicates:" + newArr[i]);
        }
    }
}
