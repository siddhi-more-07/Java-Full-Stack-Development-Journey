// enhanced switch statement introduced n java 14
// Uses -> instead of :
// No break statements needed
// Cleaner and less error-prone


import java.util.*;

public class EnhancedSwitch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Day number (1-7): ");
        int day = sc.nextInt();

        switch(day){
            case 1->  System.out.println("It's Monday!");
            case 2->  System.out.println("It's Tuesday!");
            case 3->  System.out.println("It's wednesday!");
            case 4->  System.out.println("It's Thursday!");
            case 5->  System.out.println("It's Friday!");
            case 6->  System.out.println("It's Saturday!");
            case 7->  System.out.println("It's Sunday!");
            default-> System.out.println("Invalid Day");
        }
    }
}



Output--
Enter Day number (1-7): 4
It's Thursday!