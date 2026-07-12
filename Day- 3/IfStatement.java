import java.util.*;
import java.io.*;

public class IfStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ener your age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are "+ age + ", Eligible to vote!");
        }

    }
}

Output-- 
Ener your age: 22
You are 22, Eligible to vote!