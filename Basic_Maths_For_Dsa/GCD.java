import java.util.Scanner;

public class GCD {
    public static int getGcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0)
            return a;
        else
            return getGcd(b, a % b);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter the 2nd number: ");
            int b = sc.nextInt();

            int result = getGcd(a, b);
            System.out.println("The GCD of " + a + " and " + b + " is: " + result);
        }
    }
}
