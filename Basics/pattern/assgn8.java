//package area




import java.util.*;
public class assgn8{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=0;
        while(i<n){
            int j=0;
            while(j<n){
                if(i==j || (i+j)==(n-1)){
                    System.out.print("# ");
                }
                else{ 
                    System.out.print("  ");
                }
                j++;
            }
            
            System.out.println("");
            i++;
        }
    }
}