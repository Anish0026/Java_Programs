//The correct use of the switch case statement in the java programming
import java.util.*;

public class UsageOfSwitchCase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter two numbers (a and b): ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (choice)
            {
                case 1 -> System.out.println("Result: " + (a + b));
                case 2 -> System.out.println("Result: " + (a - b));
                case 3 -> System.out.println("Result: " + (a * b));
                case 4 -> {
                    if (b != 0) {
                        System.out.println("Result: " + (a / b));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                case 5 -> {
                    if (b != 0) {
                        System.out.println("Result: " + (a % b));
                    } else {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    }
                }
                default -> System.out.println("Invalid Choice! Please enter a number between 1 and 5.");
            }
        }
    }
}