// forEach loop
// The enhanced for loop is used to traverse (visit) all elements of an array or collection.
//    for(dataType variable : array){
//        // use variable
//    }

import java.util.*;

public class forEach{
    public static void main(String[] args){

        int[] arr = {10, 20, 80, 100, 10};

        for(int n : arr){
            System.out.println(n);
        }


    // Find sum of array elements
        int sum = 0;
        System.out.println("Sum of array elements:");
        for(int num : arr){
            sum += num;
        }
        System.out.println("Sum: "+sum);


    // Find largest element in array
        int largest=0;
        for(int currentElement : arr){
            if(currentElement > largest){
                largest = currentElement;
            }
        }
        System.out.println("Largest array element: "+largest);


    // Find the average of the elements, avareage = sum of elements/ all elements
        int count=0, s=0;
        for(int c : arr){
            count++;
            s+=c;
        }
        System.out.println("Avarage of Array Elements: "+(s/count));
    }
}