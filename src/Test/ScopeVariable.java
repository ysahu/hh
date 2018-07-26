package Test;

public class ScopeVariable {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p =50;
		ScopeVariable s = new ScopeVariable();
		s.m1(p);
		System.out.println(p);
	}
	
	void m1(int p){
		
		p = 60;
	}

}
