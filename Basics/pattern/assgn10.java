//package area

// i wont do 10 11 12 questions


import java.util.*;
public class assgn10{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int j = 1;
        int sp = n;
        while(j<=n){
            int k = 1;
            while(k<=sp){
                System.out.print("  ");
                k++;
            }
            int i = 1;
            while(i<=2*j-1){
                if(i%2==0) System.out.print("! ");
                else System.out.print("# ");
                i++;
            }
            j++;
            sp--;
            System.out.println("");
        }
    }
}