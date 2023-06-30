//package area


import java.util.Scanner;

public class type1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter in binary form : ");
        int n = sc.nextInt();
        int rem =1;
        int sum1 =0;
        int pow=1;
        while(n>0){
            rem = n%10;
            sum1 = sum1+ pow*rem;
            n=n/10;
            pow=pow*2;
        }
        System.out.println("decimal is : "+sum1);
        System.out.println("no in hexadecimal is "+sum1);
    }     
} 