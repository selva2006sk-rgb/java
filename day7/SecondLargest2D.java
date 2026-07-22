package day7;
import java.util.Scanner;
public class SecondLargest2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arr[i][j] > largest) {
                    secondLargest = largest;
                    largest = arr[i][j];
                } else if (arr[i][j] > secondLargest && arr[i][j] != largest) {
                    secondLargest = arr[i][j];
                }
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}