package day4_2.concrete;

import day4_2.abstracts.BaseCustomerManager;
import day4_2.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) throws Exception {

		System.out.println("save to db : " + customer.getFirstName());

	}

}
