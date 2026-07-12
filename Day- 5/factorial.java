// Create a method to calculate factorial

import java.util.*;

public class factorial{

    public static int fact(int f){
        int r=1;
        for(int i=1; i<=f; i++){
            r = r*i;
        }
        return r;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int result = fact(n);
        System.out.println("Factorial of "+n+": "+result);
    }
}


