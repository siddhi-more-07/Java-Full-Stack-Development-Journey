import java.util.*;
import java.io.*;

class Operators{
    public static void main(String[] args){
        System.out.println("---Arithmetic Operators---");
        int a=10, b=20;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulus: "+(a%b));

        System.out.println("---Assignment Operators---");
        int x;
        System.out.println("Assign To: "+(x=40));
        System.out.println("Add and Assign: "+(x+=10));
        System.out.println("Sub and Assign: "+(x-=10));
        System.out.println("Mul and Assign: "+(x*=10));
        System.out.println("Div and Assign: "+(x/=10));
        System.out.println("Mod and Assign: "+(x%=10));

        System.out.println("---Logical Operators---");
        int check=80;
        System.out.println("&& (and): "+(check>50 && check<100));
        System.out.println("|| (or): "+(check>50 || check<100));
        System.out.println("! (not): "+(!(check<0)));

        System.out.println("---Unary Operators---");
        int p=12;
        System.out.println("Pre Increment: "+(++p));
        System.out.println("Post Increment: "+(p++));
        System.out.println("Pre Decrement: "+(p--));
        System.out.println("Post Decrement: "+(p--));

        System.out.println("---Bitwise Operators---");
        int n=5, m=2;
        System.out.println("Bitwise &: "+(n & m));
        System.out.println("Bitwise |: "+(n | m));
        System.out.println("Bitwise XOR: "+(n ^ m));
        System.out.println("Complement (~): "+(~n));

        System.out.println("---Left Shift Operators---");
        int var=5;
        System.out.println("Left shift by 1: "+(var << 1));
        System.out.println("Right shift by 1: "+(var >> 1));

        System.out.println("---Ternary Operator---");
        //Short form of if-else
        //condition ? value1 : value2;
        int age=20;
        System.out.println(age >= 18 ? "Adult" : "Minor");

    }
}


Output--
---Arithmetic Operators---
Addition: 30
Subtraction: -10
Multiplication: 200
Division: 0
Modulus: 10
---Assignment Operators---
Assign To: 40
Add and Assign: 50
Sub and Assign: 40
Mul and Assign: 400
Div and Assign: 40
Mod and Assign: 0
---Logical Operators---
&& (and): true
|| (or): true
! (not): true
---Unary Operators---
Pre Increment: 13
Post Increment: 13
Pre Decrement: 14
Post Decrement: 13
---Bitwise Operators---
Bitwise &: 0
Bitwise |: 7
Bitwise XOR: 7
Complement (~): -6
---Left Shift Operators---
Left shift by 1: 10
Right shift by 1: 2
---Ternary Operator---
Adult