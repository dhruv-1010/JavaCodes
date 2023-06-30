//package area

import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class assgn13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = 1;
        int sp = n-1;
        int ln = 0;
        while(r<=n){
            int k = 1;
            while(k <= sp){
                System.out.print("  ");
                k++;
            }
            int i =1;
            while(i<=r){
                if(i == r) System.out.println(ln);
                // else if()
                else{
                System.out.println();}
            }
            sp--;
            System.out.println("");
            r++;
        }
    }
}