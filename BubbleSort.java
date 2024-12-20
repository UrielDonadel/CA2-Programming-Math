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