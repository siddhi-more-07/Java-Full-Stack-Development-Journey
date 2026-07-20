// 

import java.util.*;

public class strMethods{
    public static void main(String[] args){
        String str= "Hello world";
        String str2 = "    Heyyy...!";
        String str3 = "heyy...!";

        System.out.println(str);

        // length- Returns length of string
        System.out.println("Length: "+str.length());

        // charAt(index)- Returns character at index
        System.out.println("charAt: "+str.charAt(2));

        // toUpperCase()- Converts to uppercase
        System.out.println("Uppercase: "+str.toUpperCase());

        // toLowerCase()- Converts to lowercase
        System.out.println("Lowercase: "+str.toLowerCase());

        // trim()- Removes leading and trailing spaces
        System.out.println("Trim: "+str2.trim());

        // equals()- Compares contents
        System.out.println("Equals: "+str.equals(str2));

        // equalsIgnoreCase()- 
        System.out.println("equalsIgnoreCase: "+str2.equalsIgnoreCase(str3));

        // compareTo()- Lexicographical comparison
        System.out.println("compareTo: "+str2.compareTo(str3));

        // concat()- Joins strings
        System.out.println("concat: "+str.concat(str2));

        // contains()- Checks substring
        System.out.println("contains: "+str2.contains("...!"));

        // startsWith()- Checks starting characters
        System.out.println("startsWith: "+str.startsWith("Hello"));

        // endsWith()- Checks ending characters
        System.out.println("endsWith: "+str.endsWith("world"));

        // substring()- Extracts part of string
        System.out.println("substring: "+str3.substring(0,3));

        // replace()- Replaces characters
        System.out.println("replace: "+str3.replace("...!", "there.."));

        // replaceAll()- replace all characters
        System.out.println("replace: "+str3.replace("...!", "there.."));

        // indexOf()- Finds first occurrence
        System.out.println("indexOf: "+str2.indexOf('!'));

        // lastIndexOf()- Finds last occurrence
        System.out.println("lastIndexOf: "+str.lastIndexOf('w'));

        // isEmpty()- Checks if empty
        System.out.println("isEmpty: "+str.isEmpty());

        // split()-Splits string
        String[] splitString = str.split(" ");
        System.out.println("split: "+Arrays.toString(splitString));




    }
}