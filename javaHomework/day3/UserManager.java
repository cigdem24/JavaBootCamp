package day3;

public class UserManager {

	public void createAccount(User user) {
		System.out.println(user.getFullName() + " kullanıcı kayıt oldu");
	}

	public void delete(User user) {
		System.out.println(user.getFullName() + " kullanıcısının kaydı silindi");
	}

	public void signIn(User user) {

		System.out.println(user.getFullName() + " kullanıcı giriş yaptı");
	}

	public void logOut(User user) {

		System.out.println(user.getFullName() + " kullanıcı çıkış yaptı");
	}

	public void profileEdit(User user) {
		System.out.println(user.getFullName() + " kullanısının bilgileri güncellendi");
	}

}
