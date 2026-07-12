// Create overloaded methods for area calculation

import java.util.*;

public class overload{
    public static double area(double r){
            double circle= 3.14*r*r;
            return circle;
        }

        public static int area(int l, int b){
            int rect = l*b;
            return rect;
        }

        public static int area(int side, boolean s){
            int square = side*side;
            return square;
        }

    public static void main(String[] args){

        double areaCircle = area(15);
        System.out.println("Area of Cirlce: "+areaCircle);

        int areaRect = area(10, 20);
        System.out.println("Area of Rectangle: "+areaRect);

        int areaSquare = area(25,true);
        System.out.println("Area of Rectangle: "+areaSquare);
    }
}