package day4_2.abstracts;

import java.rmi.RemoteException;

import day4_2.entities.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer) throws RemoteException;

}
