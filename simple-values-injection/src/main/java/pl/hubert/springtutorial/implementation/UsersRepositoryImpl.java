/**
 * 
 */
package pl.hubert.springtutorial.implementation;

import pl.hubert.springtutorial.api.Logger;
import pl.hubert.springtutorial.api.UsersRepository;
import pl.hubert.springtutorial.domain.User;

/**
 * @author Hubert
 *
 */
public class UsersRepositoryImpl implements UsersRepository {

	private Logger logger;
	
	public User createUser(String name) {
		logger.log("Tworzenie u¿ytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
