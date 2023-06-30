


import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your grade");
            int a = sc.nextInt();
            int encrpyt = a +8;
            System.out.println("Encrypted grade is ");
            System.out.println(encrpyt);
            int decrpyt = encrpyt - 8;
            System.out.println("decrypted grade is ");
            System.out.println(decrpyt);
    }
    
}