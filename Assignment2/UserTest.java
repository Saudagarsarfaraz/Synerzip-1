package assignment;

public class UserTest {
     public static void main(String[] args) {
		User user = new User();
		user.setuName("sarfaraz");
		user.setuPwd("sazz123");
		System.out.println("User Login Details");
		System.out.println("-------------");
		System.out.println("User Name:"+user.getuName());
		System.out.println("Password:"+user.getuPwd());
	}
}
