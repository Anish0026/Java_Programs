import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to reverse: ");
            int num = sc.nextInt();

            int result = 0;
            while (num > 0) {
                int digit = num % 10;
                result = result * 10 + digit;
                num = num / 10;
            }

            System.out.println("Reversed number: " + result);
        }
    }
}
