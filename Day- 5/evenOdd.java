// Method to check whether a number is even or odd

import java.util.*;

public class evenOdd{

    public static void check(){
            if(n%2==0){
                System.out.printl(n+" is Even");
            }
            else{
                System.out.printl(n+" is Odd");
            }
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        evenOdd obj = new evenOdd();
        obj.check();
        
    }
}