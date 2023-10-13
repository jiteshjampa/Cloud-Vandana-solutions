
import java.util.*;

class Pangram {
     public static void main(String args[])
     {
       String a="Abcdefghijklmnopqrstuvwxyz12";
       String b="The quick brown fox jumps over the lazy dog";
       String c="abelt to talk and walk";
       System.out.println("The string "+a+" is a "+check(a)+" Pangram");
       System.out.println("The string "+b+" is a "+check(b)+" Pangram");
       System.out.println("The string "+c+" is a "+check(c)+" Pangram");
     }
     public static boolean check(String str)
     {
         str = str.toLowerCase();
 
        boolean allLetterPresent = true;
 
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
        return allLetterPresent;
     }
     
}