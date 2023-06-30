// package methods;



public class m1 {
    static void print(int n){
        System.out.println(n);
        n--; // this line has no effect on actual parameter as parameters are passed after copying
    }
    public static void main(String[] args) {
        int a = 5;
            System.out.println(a); // prints number
            print(a); // prints number but cannot modify it
            System.out.println(a);
    }
}
