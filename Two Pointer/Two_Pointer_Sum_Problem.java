import java.util.*;

public class Two_Pointer_Sum_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ds_arr =new int[6];
        for(int i = 0; i < 6; i++) {
            System.out.print("Enter array element " + ": ");
            ds_arr[i] = sc.nextInt();
        }



        int left = 0;
        int right = ds_arr.length - 1;
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        while(left < right) {
            int sum = ds_arr[left] + ds_arr[right];
            if(sum == target) {
                System.out.println(left + " " + right);
                return;
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        sc.close();
    }
}
