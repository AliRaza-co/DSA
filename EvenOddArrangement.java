import java.util.Arrays;
import java.util.Scanner;

public class EvenOddArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integer numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        arrangeEvenOdd(numbers);
        System.out.println("Output: " + Arrays.toString(numbers));
    }

    public static void arrangeEvenOdd(int[] numbers) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            while (left < right && numbers[left] % 2 == 0) {
                left++;
            }
            while (left < right && numbers[right] % 2 != 0) {
                right--;
            }
            if (left < right) {
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
            }
        }
    }
}
