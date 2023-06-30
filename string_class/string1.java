//package area

import java.util.*;

public class string1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = "java";
        String str2 = "java";
        // this means these strings are created in String pool and they are refrencing same object that's in heap 
        String str3 = new String("java");



        if(str1 == str2) System.out.println("equal");
        else System.out.println("not equal");
        System.out.println(str1 == str2);


        
        if(str1 == str3) System.out.println("equal");
        else System.out.println("not equal");
        System.out.println(str1 == str3);
        scn.close();
    }
}