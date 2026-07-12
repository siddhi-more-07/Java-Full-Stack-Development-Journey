// Electricity Bill Calculator

// Units Consumed	Rate
// 0 - 100 units	₹5/unit
// 101 - 200 units	₹7/unit
// Above 200 units	₹10/unit


import java.util.*;

public class MiniProject{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Electricity units consumed: ");
        int units = sc.nextInt();

        if(units<=100){
            System.out.println("Total Electricity Bill: "+(units*5));
        }
        else{
            if(units>100 && units<=200){
                int temp = units-100;
                System.out.println("Total Electricity Bill: "+ ((100*5) + (temp * 7)));                
            }
            if(units>200){
                int n = units - 200;
                System.out.println("Total Electricity Bill: "+ ((100*5)+(100*7)+(n*10)));
            }
        }
    }
}


Output--
Enter Electricity units consumed: 123
Total Electricity Bill: 661