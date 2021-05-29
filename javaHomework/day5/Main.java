package day5;

import day5.business.concretes.UserCheckManager;
import day5.business.concretes.UserManager;
import day5.dataAccess.concretes.HibernateUserDao;
import day5.entitites.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User cigdemUser = new User(0, "Çiğdem", "Atak", "cigdem_atak@gmail.com", "123645456");
		UserManager userManager = new UserManager(new UserCheckManager(), new HibernateUserDao());
		userManager.createAccount(cigdemUser);
		userManager.logIn(cigdemUser.getePosta(), cigdemUser.getPassword());

		System.out.println("*********");
		User zeynepUser = new User(1, "Zeynep", "Erva", "cigdem_atak@gmail.com", "1546465");
		userManager.createAccount(zeynepUser);
		userManager.logIn(zeynepUser.getePosta(), zeynepUser.getPassword());

	}

}
