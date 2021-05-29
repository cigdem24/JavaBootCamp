package abstractDemo;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		customerManager.baseDatabaseManager = new OracleDatabaseManager();
		customerManager.getCustomer();
		customerManager.removeCustomer(new SqlServerDatabaseManager());

		BaseDatabaseManager[] baseDatabaseManagers = new BaseDatabaseManager[] { new OracleDatabaseManager(),
				new SqlServerDatabaseManager() };

		for (BaseDatabaseManager baseDatabaseManager : baseDatabaseManagers) {
			baseDatabaseManager.getData();
		}

	}

}
