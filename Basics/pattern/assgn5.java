//package area




import java.util.*;
public class assgn5{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int j = n;
        int sp = 1;
        while(j>=1){
            int k = 1;
            while(k<=sp){
                System.out.print("  ");
                k++;
            }
            int i = 1;
            while(i<=j){
                System.out.print("# ");
                i++;
            }
            j--;
            sp++;
            System.out.println("");
        }
    }
}