import java.util.*;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements of the array:");
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter the element to be searched:");
        int searchElement = sc.nextInt();
        binarySearch(arr, searchElement);
        sc.close();
    }

    static int binarySearch(int arr[], int searchElement) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while(left <= right) {
            mid = (left + right) / 2;
            if(arr[mid] == searchElement) {
                System.out.print("The element is found at index:" + mid);
                return 1;
            } else if(arr[mid] < searchElement) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
