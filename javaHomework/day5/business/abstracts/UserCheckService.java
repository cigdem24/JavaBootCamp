package day5.business.abstracts;

public interface UserCheckService {
	
	boolean firstNameCheck(String firtName);
	
	boolean lastNameCheck(String lastName);
	
	boolean passwordCheck(String password);
	
	boolean emailCheck(String email);

}
