import java.util.*;

public class ElseIfLadder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if(marks>=90){
            System.out.println("Grade: A+");
        }
        else{
            if(marks>=80){
                System.out.println("Grade: A");
            }
            else{
                if(marks>=70)
                {
                    System.out.println("Grade: B");
                }
                else{
                    if(marks>=60){
                        System.out.println("Grade: C");
                    }
                    else{
                        if(marks>=50){
                            System.out.println("Grade: D");
                        }
                        else{
                            System.out.println("Fail!");
                        }
                    }
                }
            }
        }

    }
}



Output--
Enter your marks: 93
Grade: A+
Enter your marks: 86
Grade: A
Enter your marks: 78
Grade: B
Enter your marks: 68
Grade: C
Enter your marks: 54
Grade: D
Enter your marks: 49
Fail!