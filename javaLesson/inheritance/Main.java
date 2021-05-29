package inheritance;

public class Main {

	public static void main(String[] args) {

		IndivudualCustomer enginCustomer = new IndivudualCustomer();
		enginCustomer.setId(0);
		enginCustomer.setCustomerNumber("12345");
		enginCustomer.setFirstName("Engin");
		enginCustomer.setLastName("Demiroğ");
		enginCustomer.setNationalIdentity("11112223344");

		CorporateCustomer hepsiburadaCorporateCustomer = new CorporateCustomer();
		hepsiburadaCorporateCustomer.setId(1);
		hepsiburadaCorporateCustomer.setCustomerNumber("6789");
		hepsiburadaCorporateCustomer.setCompanyName("Hepsi Burada");
		hepsiburadaCorporateCustomer.setTaxNumber("6325785");

		SendikaManager sendikaManager = new SendikaManager();
		sendikaManager.setId(2);
		sendikaManager.setCustomerNumber("111111");

		Customer[] customers = new Customer[] { enginCustomer, hepsiburadaCorporateCustomer, sendikaManager };

		for (Customer customer : customers) {
			System.out.println(customer.getClass());
		}

		CustomerManager customerManager = new CustomerManager();
		customerManager.addCustomer(enginCustomer);

		System.out.println("---------");

		customerManager.addMultipleCustomer(customers);
	}

}
