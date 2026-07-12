// Create a method to find largest element in array

import java.util.*;

public class largest{
    public static int large(int[] arr){
            int l = arr[0];
            for(int i : arr){
                if(i > l){
                    l = i;
                }
            }
            return l;
        }


    public static void main(String[] args){
        int[] arr = {10, 60, 40, 50, 100, 80};
        int largernumber = large(arr);
    System.out.println("Largest number from array: " + largernumber);

        
    }
}