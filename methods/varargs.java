import java.util.*;
public class varargs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        for(int i =1;i<=n;i++){
            int r = 1;
            while(r<=i){
                System.out.print(f3+"\t");
                f1=f2;
                f2=f3;
                f3=f1+f2;
                r++;
            }
            System.out.println("");
        }
}
}
