package day5.business.concretes;

import day5.business.abstracts.UserCheckService;
import day5.business.abstracts.UserService;
import day5.dataAccess.abstracts.UserDao;
import day5.entitites.concretes.User;

public class UserManager implements UserService {

	private UserCheckService userCheckService;
	private UserDao userDao;

	public UserManager(UserCheckService userCheckService, UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.userDao = userDao;
	}

	@Override
	public void createAccount(User user) {

		if (userCheckService.firstNameCheck(user.getFirstName()) && userCheckService.lastNameCheck(user.getLastName())
				&& userCheckService.passwordCheck(user.getPassword())
				&& userCheckService.emailCheck(user.getePosta())) {
			for (User users : userDao.getAll()) {
				if (users.getePosta() == user.getePosta()) {

					System.out.println("Bu e-posta adresi sistemimizde mecvut !");
					return;

				}
			}
			SendAVerificationEmail.verificationEmail();
			userDao.createAccount(user);
		}

	}

	@Override
	public void logIn(String email, String password) {
		for (User user : userDao.getAll()) {
			if (user.getePosta() == email && user.getPassword() == password) {

				userDao.logIn(user);
			} else {
				System.out.println("Lütfen bilgilerinizi kontrol ediniz");
			}
		}

	}

}
