import java.util.Scanner;
public class Marks {
/*
3. Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)

*/
    public static void main() {
        System.out.println("1.To input the value of the marks\n2.0 for stop the loop");
        try(Scanner sc = new Scanner(System.in)){
        int choice;
        do {
            System.out.print("Enter the option 1 for take the marks 0 for stop :- ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter the marks of the student :- ");
                int marks = sc.nextInt();
                if (marks >= 90)
                    System.out.println("This is good marks");
                else if (marks >= 60 && marks <= 89)
                    System.out.println("This is also good");
                else if (marks >= 0 && marks <= 59)
                    System.out.println("This is good as well");
                else
                    System.out.println("Plese enter a number between 1 to 100 ");
            } else if (choice != 0) {
                System.out.println("Plese enter the number 1 or 0");
            }
        }while(choice!=0);

        System.out.println("\nThanks for giving your marks!!");

    }
  }

}
