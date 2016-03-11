/**
 * 
 */
package pl.hubert.springtutorial;

/**
 * @author Hubert
 *
 */
public class User {

	private String name;
	private int age;
	private static User user;

	private User() {
		// TODO Auto-generated constructor stub
	}

	public static User getInstance(String name, int age) {
		if (user == null)
			user = new User();
		user.name = name;
		user.age = age;
		return user;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
