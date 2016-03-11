/**
 * 
 */
package pl.hubert.springtutorial.api;

import pl.hubert.springtutorial.domain.User;

/**
 * @author Hubert
 *
 */
public interface UsersRepository {

	User createUser(String name);
}
