
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int sp = n;
        while (r <= n) {
            // int j = 1;
            // while (j <(sp-r)) {
            //     System.out.print(" ");
            //     j++;
            // }
            int i = 1;
            int val = 1;
            while (i <= r) {
                System.out.print(val + " ");
                val = val * (r - i) / i;
                i++;
                sp--;
            }
            System.out.println("");
            r++;
        }
    }
}
