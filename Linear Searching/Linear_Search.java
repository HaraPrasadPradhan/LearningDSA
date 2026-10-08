import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the items of array:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the item to be searched:");
        int item = sc.nextInt();


        linearSearch(arr, item);
        sc.close();
    }

    static int linearSearch(int arr[], int item) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == item) {
                System.out.println("The item is found at index:" + i);
                return 1;
            }
        }
        return -1;
    }
}
