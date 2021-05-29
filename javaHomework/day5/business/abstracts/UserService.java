package day5.business.abstracts;

import day5.entitites.concretes.User;

public interface UserService {

	void createAccount(User user);

	void logIn(String email, String password);

}
