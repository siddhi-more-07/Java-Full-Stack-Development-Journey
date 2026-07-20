// Build-in Array methods

import java.util.*;

public class arrayMthods{
    public static void main(String[] args){
        int[] arr = {10,20,100,40,50,60};

        // Arrays.toString(arrayname)
        System.out.println(arr);
        System.out.println("Arrays.toString: "+Arrays.toString(arr));

        // Arrays.sort()
        Arrays.sort(arr);
        System.out.println("Arrays.sort: "+Arrays.toString(arr));

        // Arrays.binarySearch() — Search Element
        int index = Arrays.binarySearch(arr, 100);
        System.out.println("100 is at index: "+index);

        // Arrays.equals() — Compare Two Arrays
        int[] arr2 = {40, 45, 90, 95, 60, 65};
        System.out.println(Arrays.equals(arr, arr2));

        // Arrays.fill() — Fill Array With Same Value
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));

        // Arrays.copyOf() — Copy Array
        int[] copy = Arrays.copyOf(arr2, arr2.length);
        System.out.println(Arrays.toString(copy));

        // Arrays.copyOfRange() — Copy Specific Range
        // Arrays.copyOfRange(array, startIndex, endIndex);
        int[] result = Arrays.copyOfRange(arr2, 0, 3);
        System.out.println(Arrays.toString(result));

        // Arrays.stream() — Process Array
        int sum = Arrays.stream(arr2).sum();
        System.out.println("Sum: "+sum);

        // Arrays.parallelSort() — Faster Sorting
        Arrays.parallelSort(arr2);
        System.out.println("Sorted: "+Arrays.toString(arr2));

        // Arrays.deepToString() — Print 2D Arrays
        int[][] array = {
            {10, 20},
            {30, 40},
            {50, 60}
        };
        System.out.println(Arrays.deepToString(array));
    }
}