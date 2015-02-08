
import java.util.Scanner;

public class authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter username");
String username = keyboard.next();
if (UserAuthentication.authentication(username));{
	System.out.println("Welcome" + username);
} else {
	System.out.println("Invalid Username");
}
	}

}