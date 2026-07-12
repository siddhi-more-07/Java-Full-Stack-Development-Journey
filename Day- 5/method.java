// Method to print even numbers between 1 to 100

import java.util.*;

public class method{

    public static void even(){
            for(int i=1; i<=100; i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }

    public static void main(String[] args){    
        System.out.println("Even numbers between 1 to 100: ");
        method obj = new method();
        obj.even();
    }
}

