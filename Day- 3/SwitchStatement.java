import java.util.*;

public class SwitchStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Select the operation to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int tasknumber = sc.nextInt();

        switch (tasknumber){
            case 1:
                System.out.println("Addition: "+(a+b));
                break;

            case 2:
                System.out.println("Subtraction: "+(a-b));
                break;

            case 3:
                System.out.println("Multiplication: "+(a*b));
                break;            

            case 4:
                System.out.println("Division: "+(a/b));
                break;

            default:
                System.out.println("Out of case");
        }
    }
}


Output--
Enter two numbers: 25 30
Select the operation to perform:
1. Addition
2. Subtraction
3. Multiplication
4. Division
3
Multiplication: 750