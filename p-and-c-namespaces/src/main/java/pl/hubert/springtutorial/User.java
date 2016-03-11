/**
 * 
 */
package pl.hubert.springtutorial;

import java.util.Locale;

/**
 * @author Hubert
 *
 */
public class User {

	private String name;
	private int age;
	private Locale locale;

	public User(String name, int age, Locale locale) {
		super();
		this.name = name;
		this.age = age;
		this.locale = locale;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", locale=" + locale
				+ "]";
	}
}
