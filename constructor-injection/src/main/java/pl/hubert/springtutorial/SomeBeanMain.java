/**
 * 
 */
package pl.hubert.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.hubert.springtutorial.implementation.SomeBean;

/**
 * @author Hubert
 *
 */
public class SomeBeanMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		SomeBean bean = context.getBean("someBean", SomeBean.class);

	}

}
