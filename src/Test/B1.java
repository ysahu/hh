package Test;

public class B1 extends A1 {
	
	static int b= m2();
	
	static int m2(){
		System.out.println("B:b");
		return 20;
	}
	static{
		System.out.println("B class is loaded");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("B main");
		System.out.println("B main a:" +a);
		System.out.println("B mai  b:" +b);

	}

}
