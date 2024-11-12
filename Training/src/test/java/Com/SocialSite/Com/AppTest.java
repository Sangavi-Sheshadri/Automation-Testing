package Com.SocialSite.Com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Com.SocialSite.Signup.App;
 
//import static org.junit.jupiter.api.Assertions.assertTrue;
 
///////////////////////////////import org.junit.jupiter.api.Test;
 
/**
* Unit test for simple .
*/
public class AppTest {
public static void main(String[]args) {
		App app = new App();
		String regex="^(.+)@(.+)$";
		String email=app.userEmail("abc@gmail.com");
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(email);
		System.out.println("Is it match::"+match.matches());
		System.out.println(email);
		int pwd =app.userPassword(345678);
		System.out.println(pwd);
		app.login();
 
    }
}