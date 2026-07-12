// Mwthod Overriding
import java.util.*;

class Animal{
    public void sound(){
        System.out.println("Animal makes a sound.");
    }
}

class dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}

public class overriding {
    public static void main(String[] args){
        dog d = new dog();
        d.sound();    
    }
}