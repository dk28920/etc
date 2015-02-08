
import javax.swing.JOptionPane;
public class UserAuthentication {
	
	 private static String correctUsername = "Dongho";
	   private static String correctPassword = "1234";
	   private static String username;
	   private static String password;
	   
public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		   username = JOptionPane.showInputDialog("Enter username");
		   authentication();
	}
		  
		private static boolean authentication() {
		// TODO Auto-generated method stub
		
		boolean status = false;{
		   if (username.equalsIgnoreCase(correctUsername)) 
		   {
		   
		   password = JOptionPane.showInputDialog("Enter password");
		   if (password.equalsIgnoreCase(correctPassword)) 
		   {
		  JOptionPane.showMessageDialog(null, "Welcome " + username +"!");
		  status = true;
		  } else {
		      JOptionPane.showMessageDialog(null, "Wrong Password!");
		  }
		  }else {
		      status = false;
		      JOptionPane.showMessageDialog(null, "Wrong Username!");
		      }
		      
	}
		return status;

}

		public static boolean authentication(String username2) {
			// TODO Auto-generated method stub
			return false;
		}
}
