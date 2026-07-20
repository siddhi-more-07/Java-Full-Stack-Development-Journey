// StringBuilder
// Strings are immutable.
// StringBuilder is mutable and faster for frequent modifications.

import java.util.*;

public class stringBuilder{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" programming");
        System.out.println(sb);

        sb.insert(4, " Full");
        System.out.println(sb);

        sb.delete(4, 9);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        

    }
}