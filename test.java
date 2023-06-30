import java.util.*;
public class test {

    static int len(int n){
        // int z = n;
        int len = 0;
        while(n>0){
            len++;
            n=n/10;
        }
        return len;
    }
    public static void main(String args[]) {
        // Your Code Here
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
        //    int r= 1;
           int mul = len(n);
        //    System.out.println(mul);
           int rem = 0;
           int sum = 0;
           while(n>0){
               rem = n%10;
               sum+=rem*Math.pow(10,mul-1);
               n=n/10;
               mul--;
           }
           System.out.println(sum);
    }
}
    