package Project;
import java.util.Scanner;


public class Main {
	Scanner input = new Scanner(System.in);
	void  main () {
		Final ob = new Final();
		ob.login();
		
	ob.showOption();
	ob.selectOption();
	ob.Payment();
	ob.reciept();
	
	int i = 0;
	while  (i < 1000) {
	
	System.out.println("\t\nPress any key to go back to Main Menu");
	System.out.print("\tSelect option: ");
	String op = input.nextLine();
	 if (op == "1") 
	{
		 	ob.showOption();
			ob.selectOption();
			ob.Payment();
			ob.reciept();
	}
	else {
		ob.showOption();
		ob.selectOption();
		ob.Payment();
		ob.reciept();
}
}
}
}