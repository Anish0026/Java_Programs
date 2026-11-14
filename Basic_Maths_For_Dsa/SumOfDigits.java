import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to sum digits: ");
            int num = sc.nextInt();

            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("Sum of digits: " + sum);
        }
    }

}
