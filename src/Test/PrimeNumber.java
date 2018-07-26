package Test;

import java.util.Scanner;

public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any no :");
		no = s.nextInt();
		if(no==1){
			System.out.println("Smmalest prime number is 2");
		}
		for(i=2;i<no;i++){
			if(no%i==0){
				System.out.println("no is not an Prime");
				break;
			}
			
		}
		if(no==i){
			System.out.println("Prime number");
		}
		
		

	}

}
