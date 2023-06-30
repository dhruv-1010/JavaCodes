
// package methods;



// import java.util.Scanner;
import java.util.Scanner;
public class m2 {
    // static int max(int x,int y){
        // return (x>y)?x:y;
    // }
    
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // int x = 15;
        // int y = 25;
        System.out.println(x<<y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int res = max(10,11);
        // System.out.println(res);
        // System.out.println(max(5,6));
        int n = sc.nextInt();
        while(n-->0){
            solve();
        }
    }
}
