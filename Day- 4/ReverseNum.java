// Reverse a given number

import java.util.*;

public class ReverseNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        int lastdigit=0, reversed=0;

        String str = Integer.toString(n);
        int digits = str.length();

        for(int i=1; i<=digits; i++){
            lastdigit = n%10;
            n = n/10;
            reversed = reversed*10 + lastdigit;
        }
        System.out.println("Reversed Number: "+reversed);
    }
}

