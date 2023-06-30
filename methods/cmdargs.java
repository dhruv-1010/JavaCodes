//package area




public class cmdargs{
    public static void main(String[] args) {
        int sum = 0;
        for(String x:args){
            int a = Integer.parseInt(x);
            sum+=a;
        }
        System.out.println(sum);
    }
}