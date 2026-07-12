// Fibonacci series

import java.util.*;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int first=0;
        int second=1;

        for(int i=1; i<=n; i++){
            System.out.print(first+"\t");
            int next=first+second;
            first = second;
            second = next;
            
        }
    }
}

