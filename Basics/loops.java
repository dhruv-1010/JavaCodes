//package area




import java.util.*;
public class loops{
    public static void main(String[] var){
    Scanner scn = new Scanner(System.in);
    // if((n&1) == 0) System.out.println("even");
    // // else System.out.println("odd");
    //     int n = scn.nextInt();
    //     int x = scn.nextInt();
    //     int y = scn.nextInt();
    //     if(x >= y && x >=n ) System.out.pri88ntln(x);
    //     else if(y >= x && y >=n ) System.out.println(y);
    //     else System.out.println(n);
    System.out.println("enter marks");
    int n = scn.nextInt();
    if(n>=75) System.out.println("A");
    else if(n>=65) System.out.println("B");
    else if(n>=55) System.out.println("C");
    else if(n>=45) System.out.println("Pass");
    else System.out.println("Fail");
    }

}