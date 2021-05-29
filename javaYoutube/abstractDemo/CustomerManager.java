package abstractDemo;

public class CustomerManager {

	BaseDatabaseManager baseDatabaseManager;

	public void getCustomer() {
		// OracleDatabaseManager oraccDatabaseManager = new OracleDatabaseManager();
		// BU BAĞIMLILIK DEMEK -> KULLANMA

		baseDatabaseManager.getData();

	}

	public void removeCustomer(BaseDatabaseManager baseDatabaseManager) {
		baseDatabaseManager.getData();
	}

}
