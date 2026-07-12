// check no is prime or not
// print 1 to 100 prime numbers

import java.util.*;

public class primeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    // check no is prime or not
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isprime=true;
        if(n<=1){
            isprime=false;
        }
        else{
            for(int i=2; i<n; i++){
                if(n%i==0){
                    isprime= false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println(n + " is prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }


    // prime no between 1 to 100
    System.out.println("Prime numbers between 1 to 100: ");
    for(int i=2; i<=100; i++){
        boolean checkprime = true;
        for(int j=2; j<i; j++){
            if(i%j==0){
                checkprime = false;
                break;
            }           
        }
        if(checkprime){
            System.out.println(i);
        }
    }
    }
}



Output--
Enter a number: 5
5 is prime number
Prime numbers between 1 to 100:
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97