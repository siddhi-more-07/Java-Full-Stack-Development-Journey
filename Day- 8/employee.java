// Employee class
import java.util.*;

public class employee{
    Scanner sc = new Scanner(System.in);
    int id, salary;
    String name;
    
    public void get(){
        System.out.println("Enter employee ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee name: ");
        name = sc.nextLine();
        System.out.println("Enter employee salary: ");
        salary = sc.nextInt();
    }
    public void show(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }

    public static void main(String[] args){
        employee obj = new employee();
        
        System.out.println("Enter no of Employees: ");
        int n = obj.sc.nextInt();
 
        employee[] emp = new employee[n];

        for(int i=0; i<n; i++){
            emp[i] = new employee();
            System.out.println("\nEnter details of Employee " + (i+1));
            emp[i].get();
        }

        System.out.println("\n========== All Employee Details ==========");

        for(int i=0; i<n; i++) {
            emp[i].show();
        }
    }
}