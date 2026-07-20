// character Array

import java.util.*;

public class character_array{
    public static void main(String[] args){
        String str = "Hello";

        char[] arr = str.toCharArray();

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<str.length(); i++){
            System.out.println(arr[i]);
        }
    }
}