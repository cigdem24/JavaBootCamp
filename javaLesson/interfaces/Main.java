package interfaces;

import interfaces.CustomerManager;

public class Main {

	public static void main(String[] args) {

		Customer engin = new Customer();
		engin.setCustomerId(0);
		engin.setFullName("Engin Demiroğ");

		// Logger interface newlenemez.
		Logger[] loggers = { new DatabaseLogger(), new EmailLogger(), new SmsLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);
		customerManager.add(engin);
		customerManager.delete(engin);

	}

}
