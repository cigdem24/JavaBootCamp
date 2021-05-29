package day4_2.abstracts;

import day4_2.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Veritabanına kaydedildi");
	}

}
