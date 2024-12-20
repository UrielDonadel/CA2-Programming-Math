// Task 3: Calculating the Sum of the Diagonals of a Matrix
// gitHub: https://github.com/donadelx/CA2-Programming-Math.git

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the size of the square matrix
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[size][size];
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

         // Calculate the sums of the diagonals
        int mainDiagonalSum = 0, secondaryDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            mainDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][size - 1 - i];
        }

        // Display the results
        System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);

        scanner.close();
    }
}