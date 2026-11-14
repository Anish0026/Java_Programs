import java.util.Scanner;

public class PalindromChecking {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number to check for palindrome: ");
            int num=sc.nextInt();
            int original = num;
            int reversed = 0;
            while(num>0){
                int digit = num%10;
                reversed = reversed*10 + digit;
                num/=10;
            }
            if(original==reversed){
                System.out.println(original + " is a palindrome number.");
            }
            else{
                System.out.println(original + " is not a palindrome number.");
            }
        }
    }
}
