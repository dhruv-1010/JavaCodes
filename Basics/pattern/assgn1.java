//package area




import java.util.*;
public class assgn1{
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cp = n;
        while(n>0){
            int i =1;
            while(i<=cp){
                System.out.print("# ");
                i++;
            }
            n--;
            System.out.println("");
        }
    }
}