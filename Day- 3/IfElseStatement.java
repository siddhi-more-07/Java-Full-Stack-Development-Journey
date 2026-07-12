import java.util.*;

class IfElseStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println(number+ " is Even");
        }
        else{
            System.out.println(number+ " is Odd");
        }

    }
}


Output--
Enter a number: 2569
2569 is Odd
Enter a number: 668
668 is Even