package Test;

import java.util.Scanner;

public class SwapNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter a value :");
		a = s.nextInt();
		System.out.println(" Enter b value :");
		b = s.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
