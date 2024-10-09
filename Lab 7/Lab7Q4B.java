import java.util.Scanner;
//Recursive approach
public class Lab7Q4B {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number to calculate its factorial: ");
        int N = scanner.nextInt();

       
        long factorial = calculateFactorial(N);

       
        System.out.println("Factorial of " + N + " is: " + factorial);

        
    }

   
    public static long calculateFactorial(int N) {
        
        if (N == 0 || N == 1) {
            return 1;
        }
       
        return N * calculateFactorial(N - 1);
    }
}