package day4_2.adapter;

import java.rmi.RemoteException;

import day4_2.abstracts.CustomerCheckService;
import day4_2.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean result;
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(),
					customer.getLastName(), customer.getDateOfBirth());
		} catch (RemoteException e) {
			result = false;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
