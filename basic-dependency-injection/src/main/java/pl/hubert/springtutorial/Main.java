/**
 * 
 */
package pl.hubert.springtutorial;

import pl.hubert.springtutorial.api.Logger;
import pl.hubert.springtutorial.api.UsersRepository;
import pl.hubert.springtutorial.domain.User;
import pl.hubert.springtutorial.implementation.LoggerImpl;
import pl.hubert.springtutorial.implementation.UsersRepositoryImpl;

/**
 * @author Hubert
 *
 */
public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		
		User user = usersRepository.createUser("Hubert");
	}

}
