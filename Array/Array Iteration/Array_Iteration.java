import java.util.*;
import java.util.Scanner;
public class Array_Iteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for( int i = 0; i < arr.length; i++) {
            System.out.print("Enter array element " + ": ");
            arr[i] = sc.nextInt();
        }
        for( int iteration : arr) {
            System.out.println(iteration);
        }
    }
}
