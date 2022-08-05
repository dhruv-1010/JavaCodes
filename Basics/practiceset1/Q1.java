/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Q1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Marks in number 1");
	    int a = sc.nextInt();
	    System.out.println("Enter Marks in number 2 ");
	    int b = sc.nextInt();
	    System.out.println("Enter Marks in number 3");
	    int c = sc.nextInt(); 
		System.out.print("sum = ");
		int sum = a+b+c;
	    System.out.print(sum);
	}
}
