package day7;
import java.util.Scanner;

public class palindrom {
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

        boolean palindrome = true;

        int total = rows * cols;

        for (int k = 0; k < total / 2; k++) {

            int r1 = k / cols;
            int c1 = k % cols;

            int r2 = (total - 1 - k) / cols;
            int c2 = (total - 1 - k) % cols;

            if (arr[r1][c1] != arr[r2][c2]) {
                palindrome = false;
                break;
            }
        }

        if (palindrome)
            System.out.println("2D Array is Palindrome");
        else
            System.out.println("2D Array is Not Palindrome");
    }
}