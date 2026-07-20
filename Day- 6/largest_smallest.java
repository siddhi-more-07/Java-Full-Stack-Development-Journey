// Find the largest element.

import java.util.*;

public class largest_smallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter no of Array Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int largest=arr[0];
        for(int large: arr){
            if(large > largest){
                largest = large;
            }
        }
        System.out.println("Largest Array Element: "+largest);

        int smallest=arr[0];
        for(int small : arr){
            if(small < smallest){
                smallest = small;
            }
        }
        System.out.println("Smallest Array Element: "+smallest);
    }
}