// Find factorial of a number

import java.util.*;

public class factorial{
    public static void main(String[] ags){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    long fact=1;

    for(int i=1; i<=n; i++){
        fact = fact * i;
    }
    System.out.println("Factorial of "+ n + ": "+ fact);    
    }
}