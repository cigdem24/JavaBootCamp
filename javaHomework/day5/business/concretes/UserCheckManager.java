package day5.business.concretes;

import day5.business.abstracts.UserCheckService;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean firstNameCheck(String firtName) {
		if (firtName.length() < 2) {
			System.out.println("İsminiz en az iki karakterden oluşmalıdır !");
			return false;
		}
		return true;
	}

	@Override
	public boolean lastNameCheck(String lastName) {
		if (lastName.length() < 2) {
			System.out.println("Soyisminiz en az iki karakterden oluşmalıdır !");
			return false;
		}
		return true;
	}

	@Override
	public boolean passwordCheck(String password) {
		if (password.length() < 6) {
			System.out.println("Parolanız en az 6 karakterden oluşmalıdır !");
			return false;
		}
		return true;
	}

	@Override
	public boolean emailCheck(String email) {
		if (!EmailValidator.isEmailValid(email)) {
			System.out.println("E-mail adresiniz e-posta formatında olmalıdır !");
			return false;
		}
		return true;
	}

}
