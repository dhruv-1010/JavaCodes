import java.util.*;
public class test3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int li = 2*n+1;
        int r=1;
        int val = n;
        int mid = n;
        int sp = 2;
        int uval = val - 1;
        int lval =1, value = 1;
        while(r<=li){
            if(r==1 || r== li){
                int semv = val;
                int i = 1;
                while(i<=li){
                    if(i<=n){
                        System.out.print(semv+" ");
                        semv--;
                    }else{
                        System.out.print(semv+" ");
                        semv++;
                    }
                    i++;
                }
            }else if(r <= mid+1){
                int j = 1;
                while(j<=sp){
                    System.out.print(" ");
                    j++;
                }
                int k = 1;
                int qvall = uval;
                while(k<=2*(uval)+1){
                    if(k<=uval){
                        System.out.print(qvall+" ");
                        qvall--;
                    }else{
                        System.out.print(qvall+" ");
                        qvall++;
                    }
                    k++;
                }

                uval--;
                if(r < mid+1){
                    sp+=2;
                }
            }
            else if(r>mid+1){
                int i = 1;
                sp-=2;
                while(i<=sp){
                    System.out.print(" ");
                    i++;
                }
                // System.out.print("O");
                int k = 1;
                int svall = lval;
                while(k<=2*(value)+1){
                    if(k<=value){
                        System.out.print(svall+" ");
                        svall--;
                    }else{
                        System.out.print(svall+" ");
                        svall++;
                    }
                    k++;
                }
                lval++;
                value++;
            }
            r++;
            System.out.println("");
        }
    }
}