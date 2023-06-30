//package area

import java.util.*;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            int r = 1;
            int sp = (n -3);
            int spb = 1;
            // int spn = 1;
            while (r <= n) {
                if (r == 1 || r == n) {
                    int k = 1;
                    while (k <= (n-1)) {
                        System.out.print(" " + " ");
                        k++;
                    }
                    System.out.print(1);
                } else if (r <= n / 2 + 1) {
                    int i = 1;
                    while (i <= sp) {
                        System.out.print(" " + " ");
                        i++;
                    }
                    int j = 1;
                    int val = r;
                    while (j <= r) {
                        System.out.print(val + " ");
                        val--;
                        j++;
                    }
                    i = 1;
                    while (i <= 2 * spb - 1) {
                        System.out.print(" " + " ");
                        i++;
                    }
                    j = 1;
                    val = 1;
                    while (j <= r) {
                        System.out.print(val + " ");
                        val++;
                        j++;
                    }
                    if(r<(n/2+1)){
                        sp -= 2;
                        spb++;
                    }
                } else if (r > (n/2+1) ) {
                    spb--;
                    sp+=2;
                    int i = 1;
                    while(i<=sp){
                        System.out.print(" "+" ");
                        i++;
                    }
                    int val = n-r+1;
                    // System.out.print(val);
                    // int row = val;
                    int j = 1;
                    while(j<=(n-r+1)){
                        System.out.print(val+" ");
                        val--;
                        j++;
                    }
                    int k  =1;
                    while (k <= 2 * spb -1) {
                        System.out.print(" " + " ");
                        k++;
                    }
                    j = 1;
                    val = 1;
                    while (j <= (n-r+1)) {
                        System.out.print(val + " ");
                        val++;
                        j++;
                    }
                    // System.out.print(1);
                }
                System.out.println("");
                r++;
            }
        }
        sc.close();
    }
}