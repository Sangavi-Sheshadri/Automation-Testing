package Com.SocialSite.Com;
import Com.SocialSite.Signup.SignUp;
public class TestSignUP {
    public static void main(String[] args) {
    SignUp sin = new SignUp();
        String name = sin.name("john");
        if (name.equals("john")) {
            System.out.println("Testcase passed: Name is John");
        } else {
            System.out.println("Testcase failed: Name is not John");
        }
        String surname = sin.SurName("games");
        if (surname.equals("games")) {
            System.out.println("Testcase passed: Surname is games");
        } else {
            System.out.println("Testcase failed: Surname is not games");
        }
        String DOb = sin.DOB("15-08-2001");
        if (DOb.equals("15-08-2001")) {
            System.out.println("Testcase passed: Date of Birth is 15-08-2001");
        } else {
            System.out.println("Testcase failed: Date of Birth is incorrect");
        }
        long mobileno = sin.MobileNo(93787377);  
        if (mobileno == 76484939L) {  
        	System.out.println("Testcase passed: Mobile number is correct");
        } else {
            System.out.println("Testcase failed: Mobile number is incorrect");
        }
    }
}
