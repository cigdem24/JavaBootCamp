package inheritance;

public class CustomerManager {

	public void addCustomer(Customer customer) {

		System.out.println(customer.getCustomerNumber() + " kaydedildi.");
	}

	public void addMultipleCustomer(Customer[] customers) {

		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber() + " kaydedildi.");
		}

	}

}
