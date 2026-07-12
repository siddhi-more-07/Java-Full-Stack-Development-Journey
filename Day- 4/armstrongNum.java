// Check whether a number is Armstrong number
// Logic: 
// 9474 = 
// 9⁴ = 6561
// 4⁴ = 256
// 7⁴ = 2401
// 4⁴ = 256
// 6561 + 256 + 2401 + 256 = 9
// if original num == calculated, then it is armsrong no.

// Note:- Math.pow() returns double

import java.util.*;
import java.lang.*;

public class armstrongNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int originalno = n;

        // count digits
        String str = Integer.toString(n);
        int digits = str.length();

        double pow=0, armstrong=0, lastdigit=0;

        // calculate pow and add
        for(int i=1; i<=digits; i++){
            lastdigit = n%10;
            n=n/10;
            pow = Math.pow(lastdigit, digits);
            armstrong += pow;
            
        }

        // compare original and calculated no.
        if(originalno == armstrong){
            System.out.println(originalno+" is armstrong number.");
        }
        else{
            System.out.println(originalno+" is not armstrong number.");
        }
    }
}


Output--
Enter a number: 542
542 is not armstrong number.
Enter a number: 9474
9474 is armstrong number.