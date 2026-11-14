import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to count digits: ");
            int num = sc.nextInt();

            int count = 0;
            while (num != 0) {
                num /= 10;
                count++;
            }
            System.out.println("Number of digits: " + count);
        }
    }
}
