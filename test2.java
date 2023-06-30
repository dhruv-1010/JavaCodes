import java.util.*;
public class test2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int li = 2*n-1;
        int r =1;
        int sp = 1;
        int star = n-1;
        while(r<=li){
            if(r==1 || r==li){
                int k = 1;
                while(k<=(li)){
                    System.out.print("*");
                    k++;
                }
            }else if(r<=n){
                int i = 1;
                while(i<=star){
                    System.out.print("*");
                    i++;
                }
                int j = 1;
                while(j<=sp){
                    System.out.print(" ");
                    j++;
                } 
                i = 1;
                while(i<=star){
                    System.out.print("*");
                    i++;
                }
                if(r<n){
                    star--;
                    sp+=2;
                }
            }
            else{
                star++;
                sp-=2;
                int i = 1;
                while(i<=star){
                    System.out.print("*");
                    i++;
                }
                int j = 1;
                while(j<=sp){
                    System.out.print(" ");
                    j++;
                } 
                i = 1;
                while(i<=star){
                    System.out.print("*");
                    i++;
                }
                // star++;
            }    
            r++;
            System.out.println("");
        }
    }
}