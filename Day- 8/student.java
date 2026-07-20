// class student

import java.util.*;

public class student{
    public void info(String name, int rollno){
        System.out.println("Stud Name: "+name);
        System.out.println("Stud Rollno: "+rollno);
    }
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student();
        s1.info("Siddhi", 07);   
        s2.info("Priya", 15); 
        
    }
}