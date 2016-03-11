/**
 * 
 */
package pl.hubert.springtutorial;

import java.text.DateFormat;
import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Hubert
 *
 */
public class MainSpring {

	public static void main(String[] args) {
		// Locale locale = Locale.getDefault();
		// Calendar calendar = GregorianCalendar.getInstance(locale);
		// DateFormat formatter = SimpleDateFormat.getInstance();
		// System.out.println(formatter.format(calendar.getTime()));

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Calendar calendar = context.getBean("calendar", Calendar.class);
		DateFormat formatter = (DateFormat) context.getBean("formatter");
		System.out.println(formatter.format(calendar.getTime()));
	}

}
