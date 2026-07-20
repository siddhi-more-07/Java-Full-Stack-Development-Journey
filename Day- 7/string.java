// Strings in java

import java.util.*;

public class string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s1 = "Hello World!";
        String s2 = new String("Heyy There...");

        System.out.println(s1);
        System.out.println(s2);

        // input using next()
        System.out.println("Enter name: ");
        String name = sc.next();

        System.out.println("Using next(): "+name);

        sc.nextLine();

        // input using nextLine()
        System.out.println("Enter Full name: ");
        String fullname = sc.nextLine();

        System.out.println("Using next(): "+fullname);



    }
}