//package area




import java.util.*;
public class assgn3{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int j = n;
        while(j>0){
            int i = 1;
            while(i<=j){
                System.out.print("# ");
                i++;
            }
            j--;
            System.out.println("");
        }
    }
}