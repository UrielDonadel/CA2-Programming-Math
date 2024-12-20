// Task 2: Generating a Multiplication Table Using a 2D Array
// gitHub: https://github.com/donadelx/CA2-Programming-Math.git

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the size of the multiplication table
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        // Initialize and populate the 2D array
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // Display the multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}