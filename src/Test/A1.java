package Test;

public class A1 {

	/**
	 * @param args
	 */
	static int a = m1();
	
	 static int m1(){
		System.out.println("A:a");
		return 10;
	}
	 
	 static{
		 System.out.println("A class is loaded");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A main");
	}

}
