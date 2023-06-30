//package area
// package string_class;



import java.util.*;
public class string{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // code begin initiliazing method 1
        // this string will be in  stringpool area and this refrences the actual data
        String str = "java program"; 
        //  initializing method 2
        // this creates string in heap memonry
        String str2 = new String(" which is shit");
        // character array method
        char c[] = {'h','e','l','l','o'};
        String str3 = new String(c);
        // byte array contains ASCII of alphabets
        byte b[] = {66,65,67,98,101,98,97,119};
        String str4 = new String(b);
        // constructor is a method which  has the same name as the class name
        //  javap java.lang.String --> display all methods related to string
        String str5 = new String(b,2,4);
        System.out.println(str+str2+" "+str3+" "+str4+" "+str5);

    }   
}