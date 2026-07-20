// Check Palindrome strings

import java.util.*;

public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st String: ");

        String str1 = sc.next();

        sc.nextLine();

        String reverse = "";

        for(int i=str1.length()-1; i>=0; i--){
            reverse= reverse + str1.charAt(i);
        }
        
        if(reverse.equals(str1)){
            System.out.println("String is Palindrome!");
        }
        else{
            System.out.println("String is not Palindrome!");
        }
    }
}