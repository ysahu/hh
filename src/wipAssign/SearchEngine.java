package wipAssign;

import java.util.Scanner;

public class SearchEngine {

	public static void select(){
		System.out.println("Calling Select");
	}
	public static void upadate(){
		System.out.println("Calling update");
	}
	public static void delete(){
		System.out.println("Calling delete");
	}
	public static void where(){
		System.out.println("Calling where");
	}
	public static void main(String[] args) {
		Scanner UserInput = new Scanner(System.in);
		System.out.println("Enter your query");
		String query =UserInput.nextLine();
		String[] splitQuery =query.split("\\s+");
		for(String str:splitQuery){
			
			str=str.toUpperCase();
			switch(str) {
			case "SELECT" :
				SearchEngine.select();
				break;
			case "UPDATE" :
				SearchEngine.upadate();
				break;
			case "DELETE" :
				SearchEngine.delete();
				break;
			case "WHERE" :
				SearchEngine.where();
				break;
				
			
			}
		//CASE(str.equalsIgnoreCase("select"))
		
		//if(splitQuery.)
		}
			
		

	}

}
