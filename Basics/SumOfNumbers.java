// sum of the N numbers given by the user 
import java.util.*;
public class SumOfNumbers{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int limit;
            System.out.print("\nEnter the number to which yoou want to the sun :- ");
            limit = sc.nextInt();
            int sum = 0;
            for(int i = 0 ;i <= limit; i++ ){
                sum+=i;
            }

            System.out.println("\nThe sum till the given  number is :- "+sum);
        }
    }

}
