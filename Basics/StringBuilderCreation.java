import java.util.Scanner;

public class StringBuilderCreation {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            StringBuilder sb1 = new StringBuilder("ANISH SENAPATI");
            System.out.println("\nThe new created stringbuilder is :- "+sb1);
            System.out.println("The character of the 0th index of the StringBuilder is :- "+sb1.charAt(0));
            int id;
            System.out.print("\nEnter the number of the index :- ");
            id=sc.nextInt();
            System.out.print("\nEnter the character to replace :- ");
            char ch = sc.next().charAt(0);
            sb1.setCharAt(id,ch);
            System.out.println("The new Stringbuilder is :- "+sb1);
            System.out.println("\nAfter append some new value to the string builder :- ");
            System.out.println(sb1.append(", How Are you brothe? "));

        }
    }

}
