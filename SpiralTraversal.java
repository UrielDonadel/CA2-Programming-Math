// Task 4: Spiral Traversal of a Matrix
// gitHub: https://github.com/donadelx/CA2-Programming-Math.git

import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

         // Perform spiral traversal
        System.out.print("Spiral Traversal: ");
        spiralTraversal(matrix, rows, columns);
        scanner.close();
        }

    public static void spiralTraversal(int[][] matrix, int rows, int columns) {
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) System.out.print(matrix[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++) System.out.print(matrix[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }
}