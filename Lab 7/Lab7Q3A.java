import java.util.Scanner;
//Iterative Approach.
public class Lab7Q3A {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Fibonacci series up to " + N + ":");
        generateFibonacci(N);

        // Close the scanner
        scanner.close();
    }

    public static void generateFibonacci(int N) {
        int first = 0, second = 1;

        if (N >= 1) {
            System.out.print(first + " ");
        }

        if (N >= 2) {
            System.out.print(second + " ");
        }
        for (int i = 3; i <= N; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        System.out.println(); 
    }
}