import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n<0)
            return -1;
        else if(n==1 || n==0)
            return 1;
        else
            return fact(n-1)*n;

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num;
            System.out.print("\nEnter the number for which you want to know the factorial :- ");
            num=sc.nextInt();
            int result = fact(num);
            if(result>=1)
                System.out.println("\nThe factorial of the number "+num+" is :- "+result);
            else
                System.out.println("\nThe number is invalid to know the factorial.");
        }
    }
}
