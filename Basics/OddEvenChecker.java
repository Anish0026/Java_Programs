//tjis is used to check whether a number is odd or even
import java.util.*;
public class OddEvenChecker{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("\nEnter the number to know whether it is even or odd :- ");
        int num = sc.nextInt();
        if (num%2==0)
        {
            System.out.println("The number is an even number ");
        }
        else{
            System.out.println("the number is an odd number");
        }
      }
    }
}