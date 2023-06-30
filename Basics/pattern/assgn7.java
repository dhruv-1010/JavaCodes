//package area
import java.util.*;
public class assgn7{
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int ln = 1;
        while(ln<=n){
            if(ln == 1 || ln ==n){
                int i =1;
                while(i<=n){
                    System.out.print("# ");
                    i++;
                }
            }
            else{
                int j=1;
                while(j<=n){
                if(j==1 || j==n){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
                j++;
             }
            }
            System.out.println("");
            ln++;
        }
    }
}