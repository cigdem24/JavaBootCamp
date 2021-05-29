package day5.adapter;

import day5.core.GoogleAuthService;
import day5.dataAccess.abstracts.UserDao;
import day5.entitites.concretes.User;

public class GoogleAuthServiceAdapter implements SignUpService {

	GoogleAuthService google = new GoogleAuthService();
	private UserDao UserDao;

	public GoogleAuthServiceAdapter(day5.dataAccess.abstracts.UserDao userDao) {
		super();
		UserDao = userDao;
	}

	@Override
	public void signUp(String email) {

		for (User user : UserDao.getAll()) {
			if (user.getePosta() == email) {
				System.out.println("Bu e-posta adresi sistemimizde mevcut !");
				return;
			}
			google.signUpWithGoogle(email);
		}

	}

}
