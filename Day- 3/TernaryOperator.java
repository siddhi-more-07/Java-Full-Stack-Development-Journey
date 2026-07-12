import java.util.*;

public class TernaryOperator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        String result = (n1>n2)? n1+" is larger" : n2+" is larger";

        System.out.println(result);
    }
}


Output--
Enter two numbers: 25 55
55 is larger