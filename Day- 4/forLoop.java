import java.util.*;
class forLoop{
    public static void main(String[] args){

    // Print numbers from 1 to 10 using for loop
        System.out.println("1 to 10 numbers:");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

    // Print numbers from 10 to 1 using for loop
        System.out.println("\n10 to 1 numbers:");
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }

    //Print all even numbers between 1 to 100
        System.out.println("\nEven numbers between 1 to 100:");
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}



