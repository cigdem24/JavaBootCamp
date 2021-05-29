package day5.dataAccess.abstracts;

import java.util.List;

import day5.entitites.concretes.User;

public interface UserDao {

	void createAccount(User user);

	void logIn(User user);

	List<User> getAll();

}
