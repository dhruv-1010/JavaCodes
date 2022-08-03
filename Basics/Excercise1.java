/******************************************************************************

           CBSE BOARD PERCENTAGE CALCULATOR

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Marks in English");
	    int a = sc.nextInt();
	    System.out.println("Enter Marks in Maths");
	    int b = sc.nextInt();
	    System.out.println("Enter Marks in Hindi");
	    int c = sc.nextInt();
	    System.out.println("Enter Marks in Science");
	    int d = sc.nextInt();
	    System.out.println("Enter Marks in Gk");
	    int e = sc.nextInt();    
		System.out.print("Your CBSE X percentage is = ");
		double sum = a+b+c+d+e;
	    System.out.print(sum/5);
	}
}
