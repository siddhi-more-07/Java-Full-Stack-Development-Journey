//Reverse a String (without built-in method)

import java.util.*;

public class strReverse{
    public static void main(String[] args){
        String str = new String("Java Programming");

        System.out.println(str);

        System.out.println("Reverse String: ");
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        }

    }
}