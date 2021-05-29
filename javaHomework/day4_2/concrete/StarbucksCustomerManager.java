package day4_2.concrete;

import day4_2.abstracts.BaseCustomerManager;
import day4_2.abstracts.CustomerCheckService;
import day4_2.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {

		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to database : " + customer.getNationalityId());
		} else {
			System.out.println("Not a valid person");
		}

	}
}
