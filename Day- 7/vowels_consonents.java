// Count Vowel & Count Consonants

import java.util.*;

public class vowels_consonents{
    public static void main(String[] args){
        String str = "Java Programming";

        String str2 = str.toLowerCase();

        int vowel=0, consonent=0;

        for(int i=0; i<str.length(); i++){
              if(str2.charAt(i)== 'a' ||
                str2.charAt(i)== 'e' ||
                str2.charAt(i)== 'i' ||
                str2.charAt(i)== 'o' ||
                str2.charAt(i)== 'u')
                {
                    vowel++;
              }
              else{
                consonent++;
              }
            }
            System.out.println("Vowels: "+vowel);
            System.out.println("Consonents: "+consonent);
        }
}