import java.util.Scanner;
public class Array_Traverse_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the element to search: ");
        int element = sc.nextInt();
        // Taking input for the 2D array
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //Searching the element in the 2D array and return its position
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(arr[i][j] == element) {
                    System.out.print(i + " " + j);
                }
            }
        }
    }
}
