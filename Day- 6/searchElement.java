// Search for an element.

import java.util.*;

public class searchElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Array Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" Elements of Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element to search: ");
        int search = sc.nextInt();

        boolean found = true;
        int index=0;

        for(int element : arr){
           
            if(element == search){
                found = true;
                break;
            }
            else{
                found = false;
            }

             index++;
        }

        if(found){
            System.out.println("Element Found at: "+index);
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}