//print all the even and odd numbers frfom  0 to a given limit number 
import java.util.Scanner;

public class OddEvenCheckerLimit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the limit up to which you want even and odd numbers: ");
            int limit = sc.nextInt();

            StringBuilder evenSb = new StringBuilder();
            StringBuilder oddSb = new StringBuilder();

            for (int i = 0; i <= limit; i++) {
                if (i % 2 == 0) {
                    evenSb.append(i).append(", ");
                } else {
                    oddSb.append(i).append(", ");
                }
            }

            // Clean up trailing ", " at the end of each StringBuilder
            if (evenSb.length() > 0) evenSb.setLength(evenSb.length() - 2);
            if (oddSb.length() > 0) oddSb.setLength(oddSb.length() - 2);

            System.out.println("\nThe Even numbers from 0 to " + limit + " are:");
            System.out.println(evenSb.toString());

            System.out.println("\nThe Odd numbers from 0 to " + limit + " are:");
            System.out.println(oddSb.toString());
        }
    }
}
