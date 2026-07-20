// Count even and odd numbers.

import java.util.*;

public class countEvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of array elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int even=0, odd=0;

        for(int evenodd : arr){
            if(evenodd % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);

    }
}