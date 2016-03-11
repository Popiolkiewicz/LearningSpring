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
	
	public UsersRepositoryImpl(Logger logger, String localization, String dbName) {
		this.logger = logger;
		logger.log("Lokalizacja repozytorium: " + localization + "/" + dbName);
	}
	
	public User createUser(String name) {
		logger.log("Tworzenie u¿ytkownika " + name);
		return new User(name);
	}

}
