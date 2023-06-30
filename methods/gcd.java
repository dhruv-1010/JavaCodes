// 
//package area




public class gcd{
    // naivest euclidean approach
    static void gcd(int x,int y){
        while(x!=y){
            if(x>y) x = x-y;
            else y = y-x;
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        gcd(100,17);
    }
}