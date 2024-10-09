import java.util.Scanner;
//Iterative approach
public class Lab7Q4A {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a number to calculate its factorial: ");
        int N = scanner.nextInt();

        
        long factorial = calculateFactorial(N);

        
        System.out.println("Factorial of " + N + " is: " + factorial);

      
    }

    
    public static long calculateFactorial(int N) {
        long result = 1;

        for (int i = 1; i <= N; i++) {
            result *= i;
        }

        return result;
    }
}