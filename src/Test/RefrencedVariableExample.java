package Test;

public class RefrencedVariableExample {

	/**
	 * @param args
	 */
	int eid;
	String employeeName;
	String companyName;
	
	public String toString(){
		return "eid:" + eid +"\n" +"ename:"+ employeeName+ "\n" +"Company:"+ companyName +"\n";
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RefrencedVariableExample r = new RefrencedVariableExample();
		
		r.eid = 51533634;
		r.employeeName= "Yashwant Sahu";
		r.companyName="HCL";
		System.out.println(r);
	}

}
