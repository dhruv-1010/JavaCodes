//package area


import java.util.Scanner;

public class type{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int mul = 1;
        int sum = 0;
        while(n>0){
            r=n%6;
            sum+=r*mul;
            n=n/6;
            mul*=10;
        }     
        System.out.println(sum);
    } 
}