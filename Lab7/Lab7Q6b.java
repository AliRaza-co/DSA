
import java.util.Random;
import java.util.Scanner;

public class Lab7Q6b {

    // Recursive method to search for the value in the array
    public static int search(int[] arr, int searchValue, int index) {
        // Base case: If we've reached the end of the array
        if (index == arr.length) {
            return 0; // Value not found
        }
        // If the value at the current index matches the search value
        if (arr[index] == searchValue) {
            return 1; // Value found
        }
        // Recursive call to search in the remaining part of the array
        return search(arr, searchValue, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Create an array and fill it with random values
        int[] arr = new int[10];
        System.out.println("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // Random values between 0 and 99
            System.out.print(arr[i] + " ");
        }

        // Ask the user for the search value
        System.out.println("\n\nEnter the value to search: ");
        int searchValue = scanner.nextInt();

        // Call the recursive search method
        int result = search(arr, searchValue, 0);

        // Output the result
        if (result == 1) {
            System.out.println("Value found!");
        } else {
            System.out.println("Value not found!");
        }

        scanner.close();
    }
}
