import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int row,col;
            System.out.print("\nEnter the nuumber of the row :- ");
            row = sc.nextInt();
            System.out.print("\nEnter the number of columns :- ");
            col=sc.nextInt();
            int arr[][] = new int[row][col];
            for(int i=0;i<=row-1;i++){
                for(int j=0;j<=col-1;j++){
                    System.out.print("\nEnter the element of arr["+i+"]["+j+"]"+" is :- ");
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("\nThe created 2_D array is :- ");
            for(int i=0;i<=row-1;i++){
                for(int j=0;j<=col-1;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.print("\n");
            }
        }
    }

}
