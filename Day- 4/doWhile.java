// do-while loop
// Guess the Number
// Number=54

import java.util.*;

public class doWhile{
    public static void main(String[] args){
        System.out.println("---Guess the number Game---");

        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("Guess a Number: ");
            n = sc.nextInt();
            if(n>54){
                System.out.println("Number is larger");
            }
            else{
                if(n<54){
                    System.out.println("Number is smaller");
                }
                else{
                    System.out.println("Correct Guess!");
                }
            }
        }
        while(n!=54);
    }
}


Output--
Guess a Number:
25
Number is smaller
Guess a Number:
88
Number is larger
Guess a Number:
45
Number is smaller
Guess a Number:
54
Correct Guess!

