// Task 5: Bubble Sort - Sorting an Array
// gitHub: https://github.com/donadelx/CA2-Programming-Math.git

import java.util.Scanner;

public class BubbleSort {
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

        // Perform Bubble Sort
        int swapCount = bubbleSort(array);

        // Display the results
        System.out.println("Array after sorting:");
        for (int num : array) System.out.print(num + " ");
        System.out.println("\nTotal number of swaps: " + swapCount);

        scanner.close();
    }

    public static int bubbleSort(int[] array) {
        int swapCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
}