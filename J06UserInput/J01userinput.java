package J06UserInput;
import java.util.Scanner;

public class J01userinput {
 
    // https://www.w3schools.com/java/java_user_input.asp
    public static void main(String[] args) {
        
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter Your Name: ");

        // String username = myobj.nextLine();
        // int r = myobj.nextInt();
        String r = myobj.next();

        System.out.println("Hello , " + r);
    }
}
