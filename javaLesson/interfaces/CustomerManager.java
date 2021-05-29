package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {

		System.out.println(customer.getFullName() + " müşterisi eklendi");

		// CLEAN KOD
		/*
		 * for (Logger logger : loggers) { logger.log(customer.getFullName()); }
		 */

		Utils.runLoggers(loggers, customer.getFullName());
	}

	public void delete(Customer customer) {

		System.out.println(customer.getFullName() + " müşterisi silindi");

		// KÖTÜ KOD ->>
		/*
		 * DatabaseLogger databaseLogger = new DatabaseLogger();
		 * databaseLogger.log(customer.getCustomerId() + " veritabanına loglandı");
		 */
		// Burada smslogger kullanmak istersek databaselogger olan heryeri smslogger
		// olarak değiştirmemiz gerekir.
		// simple is best.
		// Customer manager loggera katı bağlı.
		// İki tip bağlılık vardır. loosly - tithtly coupled
		//
	}

}
