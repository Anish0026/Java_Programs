// this is the ocde to implement the String Methods
import java.util.*;

public class StringsMethods {
    static void main() {
        // normal use of string and concatination
        String fname="Anish";
        String lname="Senapati";
        System.out.println((fname+" "+lname));

        //use of sc.net and sc.nextLine

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("\nEnter a sentenece :- ");
            String f2 = sc.nextLine();
            System.out.println(f2);

            // use of the charAt method
            System.out.println("each character of the strings :- ");
            for(int i=0 ;i<f2.length();i++){
                System.out.print(f2.charAt(i)+" ");
            }
            String name1 = "Tony";
            String name2 = "Tony5";
            int p = (name1.compareTo(name2));
            if (p==0){
                System.out.println("\n"+name1+" and "+name2+" are equal");
            }
            else{
                System.out.println("\n"+name1+" and "+name2+" are not equal");
            }
            // Substring
            String k = "hi my name is anish senapati";
            System.out.println("The substring is :- "+k.substring(14));
        }

    }
}
