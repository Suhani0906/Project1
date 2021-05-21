import java.util.Scanner;
public class Regex {
	public static void main(String args[])
	{
		Scanner sc = new Scanner  (System.in); {
			System.out.println("Please Enter you email id:");
			String email = sc.nextLine();
			Boolean regexMatched = email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
					if(regexMatched)
						System.out.println("Validation Successfull");
					else
						System.out.println("Validation Failed Please Enter valid email number ");
		}
	}
}
