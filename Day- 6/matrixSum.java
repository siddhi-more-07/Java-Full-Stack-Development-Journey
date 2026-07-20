// Find the sum of all elements.

import java.util.*;

public class matrixSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows and cols: ");

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        int i=0, j=0;

        for(i=0; i<rows; i++){
            System.out.println("Enter "+cols+" elements of "+(i+1)+" row: ");
            for(j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum=0;
        for(i=0; i<rows; i++){
            for(j=0; j<cols; j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of all elements of array: "+sum);
    }
}