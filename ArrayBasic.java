import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int size;
            System.out.print("\nEnter the size of the array :- ");
            size=sc.nextInt();
            int[] arr = new int[size];
            for(int i=0;i<size;i++){
                System.out.print("\nEnter the "+(i+1)+"th element of the array :- ");
                arr[i]=sc.nextInt();
            }
            System.out.println("\nThe created array is :- ");
            for(int val : arr){
                System.out.print(val+" ");
            }
        }
    }
}
