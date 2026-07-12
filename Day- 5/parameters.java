// A method to add two numbers

import java.util.*;
import java.lang.*;

public class parameters{

    // Method to add two numbers
    public static int add(int a, int b){
        return a+b;
    }

    // Method to find the largest of two numbers
    public static void largest(int x, int y){
        if(x>y){
            System.out.println(x+" is larger!");
        }
        else{
            System.out.println(y+" is larger!");
        }
    }


    // Pre-defined methods
    public static void predefined(){
        System.out.println("Square root of 25: "+Math.sqrt(25));
    }

    public static void main(String[] args){
        parameters p = new parameters();

        int result = add(10, 20);
        System.out.println("Sum: "+result);

        p.largest(50, 30);

        p.predefined();
    }
}
