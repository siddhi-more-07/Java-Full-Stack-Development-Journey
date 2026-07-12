import java.util.*;

public class NestedIf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String Password = sc.next();

        if(username.equals("admin")){
            if(Password .equals("admin@123")){
                System.out.println("Login Successful...");
            }
            else{
                System.out.println("Enter Correct password");
            }
        }
        else{
            System.out.println("Enter correct username");
        }
    }
}


Output--
Enter username: admin
Enter Password: admin@123
Login Successful...