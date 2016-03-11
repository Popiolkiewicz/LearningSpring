/**
 * 
 */
package pl.hubert.springtutorial.implementation;

import java.util.Date;

import pl.hubert.springtutorial.api.Logger;

/**
 * @author Hubert
 *
 */
public class LoggerImpl implements Logger {

	public void log(String message) {
		System.out.println(new Date() + ": " + message);
	}

}
