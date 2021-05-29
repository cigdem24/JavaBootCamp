package interfaces;

public class Customer {

	private int customerId;
	private String fullName;
	/*
	 * for (Logger logger : loggers) { logger.log(message); }
	 */

	public Customer() {

	}

	public Customer(int customerId, String fullName) {
		super();
		// onu inherite eden bir sınıf varsa onun parametresiz contructor da çalıştır.
		this.customerId = customerId;
		this.fullName = fullName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
