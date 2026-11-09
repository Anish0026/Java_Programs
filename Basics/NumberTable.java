//implementation of the multiplicatioon table 
import java.util.*;
public class NumberTable {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num;
            System.out.print("\nEnter the number for which you want to print the multiplication table :- ");
            num = sc.nextInt();
            System.out.println("\nThe multiplication tablle of the number  "+num+" is :- ");
            for(int i=1;i<=10;i++){
                System.out.println(num+"X"+i+" = "+(num*i));
            }
        }
    }
}
