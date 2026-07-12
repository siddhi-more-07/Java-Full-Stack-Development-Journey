import java.io.*;
import java.util.*;

class input_output{
    public static void main(String[] args) throws Exception{
    
        //Scanner class
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Age ");
        int age = sc.nextInt();

        System.out.println("Enter percentage: ");
        double percent = sc.nextDouble();

        System.out.print("\n");

        System.out.println("--Student Details---");
        System.out.println("Stud Name: "+name);
        System.out.println("Stud Age: "+age);
        System.out.println("Stud Percent: "+percent);


        System.out.println("\n");


        //BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Uesrname: ");
        String username = br.readLine();
        System.out.println("Enter Password: ");
        int pass = Integer.parseInt(br.readLine());
        //double marks = Double.parseDouble(br.readLine());

        System.out.print("\n");
        System.out.println("---Login Details---");
        System.out.println("Username: "+username);
        System.out.println("Password: "+pass);


        System.out.println("\n");
        
        System.out.println("---Printing Formatted Strings---");
        double d = 12.56789;
        System.out.println("Original Value: "+d);
        System.out.println("%.2f: "+d);

        System.out.printf("Hello%nWorld"+"\n");

        // spaces left before string
        // String is of 15 character, extra 5 spaces will be left before string
        System.out.printf("%20s", "Right Alignment"+"\n");

        System.out.printf("Heyyy... %20s", "There..!");

    }
}


Output--
Enter Name:
Siddhi S. More
Age
22
Enter percentage:
86.45

--Student Details---
Stud Name: Siddhi S. More
Stud Age: 22
Stud Percent: 86.45


Enter Uesrname:
siddhi_more_07
Enter Password:
123456

---Login Details---
Username: siddhi_more_07
Password: 123456


---Printing Formatted Strings---
Original Value: 12.56789
%.2f: 12.56789
Hello
World
    Right Alignment
Heyyy...             There..!