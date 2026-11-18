public class AllPrimeNumbersFrom1ToN {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter a limit: ");
            int n = sc.nextInt();

            System.out.println("Prime numbers from 1 to " + n + ":");
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
