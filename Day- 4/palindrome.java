// check number is palindrome or not using for loop

import java.util.*;

public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome: ");
        int n = sc.nextInt();
        int originalnum = n;
        int lastdigit=0, reverse=0;

        String str = Integer.toString(n);
        int digits = str.length();

        for(int i=1; i<=digits; i++){
            lastdigit = n%10;
            n = n/10;
            reverse = reverse*10 + lastdigit;
        }
        // System.out.println("Reevrsed number: "+reverse);
        if(originalnum == reverse){
            System.out.println(originalnum+" is palindrome!");
        }
        else{
            System.out.println(originalnum+" is not palindrome!");
        }
    }
}

