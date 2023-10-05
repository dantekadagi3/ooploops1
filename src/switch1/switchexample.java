package switch1;
import java.util.Scanner;
public class switchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize statements
		System.out.println("enter programming language");
		Scanner prog= new Scanner(System.in);
		String lang = prog.next();
		switch(lang) {
		case "java":
			System.out.println("java current version is 12.");
			break;
		case "python":
			System.out.println("python current version is 3.7");
			break;
		case "rust":
			System.out.println("rust current version is 1.34.1");
			break;
			default:
				System.out.println("we don't have information about this programming language");
		}

	}

}
