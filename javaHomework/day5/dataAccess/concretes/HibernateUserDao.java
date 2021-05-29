package day5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5.dataAccess.abstracts.UserDao;
import day5.entitites.concretes.User;

public class HibernateUserDao implements UserDao {

	private List<User> userList = new ArrayList<User>();

	@Override
	public void createAccount(User user) {
		System.out.println("Kullanıcı başarılı bir şekilde sisteme giriş yapmıştır.");
		userList.add(user);

	}

	@Override
	public void logIn(User user) {
		System.out.println("Başarılı bir şekilde giriş yaptınız " + user.getFirstName());

	}

	@Override
	public List<User> getAll() {

		return userList;
	}

}
