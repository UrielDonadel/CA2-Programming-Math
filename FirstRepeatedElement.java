// Task 1: Finding the First Repeated Element in an Array
// gitHub: https://github.com/donadelx/CA2-Programming-Math.git

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the first repeated element
        int repeatedElement = findFirstRepeated(array);

        // Display the result
        if (repeatedElement != -1) {
            System.out.println("First repeated element: " + repeatedElement);
        } else {
            System.out.println("No repeated elements found.");
        }

        scanner.close();
    }

    // Method to find the first repeated element in an array
    public static int findFirstRepeated(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : array) {
            if (seen.contains(num)) {
                return num; // Return the first repeated element
            }
            seen.add(num);
        }
        return -1; // No repeated element found
    }
}