import java.util.Scanner;
//REcursive Approach
public class Lab7Q3B {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Fibonacci series up to " + N + ":");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        
        scanner.close();
    }

    public static int fibonacci(int n) {
    
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}