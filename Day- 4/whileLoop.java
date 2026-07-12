import java.util.*;

public class whileLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=1;

    // // print 1 to 10 numbers
    //     System.out.println("1 to 10 numbers using while:");
    //     while(i<=10){
    //         System.out.println(i);
    //         i++;
    //     }

    // // print 10 to 1 numbers
    //     System.out.println("10 to 1 numbers using while:");
    //     i=10;
    //     while(i>=1){
    //         System.out.println(i);
    //         i--;
    //     }

    // // Even numbers between 1 to 100
    //     System.out.println("Even numbers between 1 to 100:");
    //     i=2;
    //     while(i<=100){
    //         if(i%2==0){
    //             System.out.println(i);
    //         }
    //         i++;
    //     }

    // // Sum of numbers from 1 to n
    //     System.out.println("Enter a number: ");
    //     int n = sc.nextInt();
    //     int sum=0;
    //     i=1;
    //     while(i<=n){
    //        sum= sum+i; 
    //        i++;
    //     }
    //     System.out.println("Sum of numbers from 1 to "+n+": "+sum);

    // // factorial of a number
        // System.out.println("Enter a number to find factorial: ");
        // n = sc.nextInt();
        // i=1;
        // long fact=1;
        // while(i<=n){
        //     fact = fact * i;
        //     i++;
        // }
        // System.out.println("Factorial of "+n+": "+fact);

    // Count digits in a number
        // System.out.println("Enter a number to count digits: ");
        // int num = sc.nextInt();
        // int count=0;
        // while(num!=0){
        //     num= num/10;
        //     count++;
        // }
        // System.out.println("No of digits: "+count);

    // Reverse a number
        System.out.println("Enter a number to Reverse: ");
        int numr = sc.nextInt();
        int lastdigit=0, reverse=0;
        while(numr!=0){
            lastdigit = numr % 10;
            numr = numr/10;
            reverse = reverse * 10 + lastdigit;
        }
        System.out.println("Reverse number: "+reverse);
    }
}