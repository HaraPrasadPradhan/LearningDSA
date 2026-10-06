import java.util.*;

public class Maximum_Sum_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter array items:");
            arr[i] = sc.nextInt();
        }



        int width = 0;
        System.out.print("Enter the width of the subarray:");
        width = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - width; i++) {
            int sum = 0;
            for(int j = i; j < i + width; j++) {
                sum += arr[j];
            }
            if(sum > max) {
                max = sum;
            }
        }
        System.out.print("Sum of subarray:" + max);
        sc.close();
    }
}