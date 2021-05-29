package day4_2.concrete;

import day4_2.abstracts.CustomerCheckService;
import day4_2.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
