// Find the sum of all elements.

import java.util.*;

public class array{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter no of array elements: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter "+n+" elements of Array: ");
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }

    // sum of array elements
    int sum=0;
    for(int s : arr){
        sum += s;
    }
    System.out.println("Sum of array elements: "+sum);
    
    }
}