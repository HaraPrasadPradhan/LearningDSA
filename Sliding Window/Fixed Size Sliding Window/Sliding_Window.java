import java.util.*;

public class Sliding_Window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the array items:");
            arr[i] = sc.nextInt();
        }


        int width = 0;
        System.out.println("Enter the width of the subarray:");
        width = sc.nextInt();


        slidingWindow(arr, width);
        
        sc.close();
    }


    static void slidingWindow(int[] arr, int width) {
        int sum = 0;
        for(int i = 0; i < width; i++) {
            sum += arr[i];
        }
        int max = sum;
        for(int i = 1; i <= arr.length - width; i++) {
            sum = sum - arr[i - 1] + arr[i + width - 1];
            if(sum > max) {
                max = sum;
            }
        }
        System.out.println("Maximum sum of the subarray of width:" + max);
    }
}
