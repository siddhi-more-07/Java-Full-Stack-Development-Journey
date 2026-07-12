// Java Type Casting

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	System.out.println("---Widening (Implicit Casting)---");
        //small datatype -> big datatye
        //Java does it automatically
        
	int a = 10;
	double d = a;
        System.out.println("Integer Type: "+a);
        System.out.println("Double Type: "+d);
        
        float f = 12.22f;
        double df = f;
        System.out.println("Float Type: "+f);
        System.out.println("Double Type: "+df);
        
        char letter = 'A';
        int num = letter;
        System.out.println("Char Type: "+letter);
        System.out.println("Integer Type: "+num);
        
        System.out.print("\n");
        
        System.out.println("---Narrowing (Explicit Casting)---");
        //Big datatype -> small datatype
        //must be done manually
        
        double dd = 123.45678912;
        int doubleint = (int) dd;
        System.out.println("Double Type: "+dd);
        System.out.println("Integer Type: "+doubleint);
        
	}
}


Output--
---Widening (Implicit Casting)---
Integer Type: 10
Double Type: 10.0
Float Type: 12.22
Double Type: 12.220000267028809
Char Type: A
Integer Type: 65

---Narrowing (Explicit Casting)---
Double Type: 123.45678912
Integer Type: 123




