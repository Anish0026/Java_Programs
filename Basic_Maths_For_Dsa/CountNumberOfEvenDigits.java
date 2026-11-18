public class CountNumberOfEvenDigits {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int count = 0;

            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    count++;
                }
                number /= 10;
            }

            System.out.println("Number of even digits: " + count);
        }
    }
    
}
