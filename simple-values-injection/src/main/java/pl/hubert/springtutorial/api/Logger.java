/**
 * 
 */
package pl.hubert.springtutorial.api;

/**
 * @author Hubert
 *
 */
public interface Logger {
	void log(String message);

	void setName(String name);
	
	void setVersion(int version);
}
