package de.khayal.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.khayal.bookstore.domain.User;
import de.khayal.bookstore.domain.security.PasswordResetToken;
import de.khayal.bookstore.repository.PasswordResetTokenRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private PasswordResetTokenRepository passwordResetTokenRepository;
	
	@Override
	public PasswordResetToken getPasswordResetToken(String token) {
		return passwordResetTokenRepository.findByToken(token);
	}

	@Override
	public void createPasswordResetTokenForUser(User user, String token) {
		final PasswordResetToken myToken  = new PasswordResetToken(token, user);
		passwordResetTokenRepository.save(myToken);
	}

	
}
