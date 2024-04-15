
import java.io.Console;

public class if_else5 {
    public static void main(String[] args) {
       // Create the console object
        Console cnsl
            = System.console();
  
        if (cnsl == null) {
            System.out.println(
                "No console available");
            return;
        }
  
        // Read line
        String str = cnsl.readLine(
            "Enter username : ");
  
        // Print username
        System.out.println(
            "Username : " + str);
  
        // Read password
        // into character array
        char[] ch = cnsl.readPassword(
            "Enter password : ");
  
        // Print password
        System.out.println(
            "Password : " + ch);





       
    }
    
}
