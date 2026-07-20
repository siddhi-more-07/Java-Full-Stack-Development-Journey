// Reverse an array.

import java.util.*;

public class reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter no of Array Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed Array: ");
        int reversedElement;
        for(int r=n-1; r>=0; r--){
            reversedElement = arr[r];
            System.out.println(reversedElement);
        }
    }
}