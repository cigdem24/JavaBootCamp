package inheritance2;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new DataBaseLogger());

		DataBaseLogger dataBaseLogger = new DataBaseLogger();
		dataBaseLogger.log();

		Logger logger = new Logger();
		logger.log();

	}
}