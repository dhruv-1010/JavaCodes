import java.net.Socket;
import java.util.Scanner;

//package area

public class test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int li = 2 * n+1;
        int r = 1;
        int sp = 2 * n-1;
        int value = n;
        int sval = n;
        int lval=1;
        while (r <= li) {
            if (r <n + 1) {
                int val = n;
                int k = 1;
                while (k <= r) {
                    System.out.print(val+" ");
                    val--;
                    k++;
                }
                int i = 1;
                while (i <= 2*sp) {
                    System.out.print(" ");
                    i++;
                }
                k = 1;
                // val = 1;
                while (k <= r) {
                    val++;
                    System.out.print(val+" ");
                    k++;
                }

                val--;
                sp -= 2;
            }else if(r>n+1){
                sp+=2;
                int k = 1;
                lval = n;
                while(k<=sval){
                    System.out.print(lval+" ");
                    lval--;
                    k++;
                }
                int i =1;
                while (i <= 2*sp) {
                    System.out.print(" ");
                    i++;
                }
                k = 1;
                while(k<=sval){
                    lval++;
                    System.out.print(lval+" ");
                    k++;
                }
                sval--;
                lval++;
            }else if(r==(n+1)){
                int k = 1;
                int val = n;
                while(k<=li){
                    if(k<(n+1)){
                        System.out.print(val+" ");
                        val--;
                    }else{
                        System.out.print(val+" ");
                        val++;
                    }
                    k++;
                }
            }
            r++;
            value--;
            System.out.println("");
        }
    }
}