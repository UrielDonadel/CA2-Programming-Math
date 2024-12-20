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