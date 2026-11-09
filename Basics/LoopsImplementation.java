// this is the code to understand the loooping in the program ..
public class LoopsImplementation {
    public static void main(String[] args){
            System.out.println("\nBy the for loop :- ");
            for(int i = 0 ; i<= 10 ; i++){
                System.out.println("value of i :- "+i);
            }
            System.out.println("\nBy the while loop :- ");
            int j = 0;
            while(j<=10){
                System.out.println("The value of j :- "+j);
                j++;
            }
            System.out.println("\nBy the do_while loop :- ");
            int k=0;
            do{
                System.out.println("The value of k is :- "+k);
                k++;
            }while(k<=10);
    }
}
