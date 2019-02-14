package de.khayal.bookstore.service;

import de.khayal.bookstore.domain.User;
import de.khayal.bookstore.domain.security.PasswordResetToken;

public interface UserService {
	
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
}