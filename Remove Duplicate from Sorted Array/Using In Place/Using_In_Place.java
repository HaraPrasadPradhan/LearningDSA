import java.util.*;
public class Using_In_Place {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the items of the array:");
            arr[i] = sc.nextInt();
        }
        removeDuplicates(arr);
        sc.close();
    }
    static void removeDuplicates(int arr[]) {
        int x = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[x] != arr[i]) {
                x++;
                arr[x] = arr[i];
            }
        }
        for(int i = 0; i < x + 1; i++) {
            System.out.println("The Inplace array after removing duplicates:" + arr[i]);
        }
    }
}
