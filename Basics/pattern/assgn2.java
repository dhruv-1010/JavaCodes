//package area




import java.util.*;
public class assgn2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int j = 1;
        while(j<=n){
            int i = 1;
            while(i<=j){
                System.out.print("# ");
                i++;
            }
            j++;
            System.out.println("");
        }
    }
}