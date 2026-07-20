// Print row-wise and column-wise sum

import java.util.*;

public class rowColSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows and cols: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int i=0, j=0;

        for(i=0; i<rows; i++){
            System.out.println("Enter "+cols+" elements of "+(i+1)+"th row: ");
            for(j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // sum of rows
        for(i=0; i<rows; i++){
            int rowsum = 0;
            for(j=0; j<cols; j++){
                rowsum+=arr[i][j];
            }
            System.out.println("Row " + (i+1) + " sum = " + rowsum);
        }

        // sum of cols
        for(j=0; j<cols; j++){
            int colsum=0;
            for(i=0; i<rows; i++){
                colsum += arr[i][j];
            }
            System.out.println("Column " + (j+1) + " sum = " + colsum);
        }
        



        
    }
}