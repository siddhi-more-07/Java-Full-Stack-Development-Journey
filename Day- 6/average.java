// Find the average.

import java.util.*;

public class average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+ " elements of Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int sum=0;
        for(int s=0; s<n; s++){
            sum+=arr[s];
        }
        System.out.println("Average: "+(sum/n));
    }
}