package day4_2;

import day4_2.abstracts.BaseCustomerManager;
import day4_2.adapter.MernisServisAdapter;
import day4_2.concrete.NeroCustomerManager;
import day4_2.concrete.StarbucksCustomerManager;
import day4_2.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		baseCustomerManager.save(new Customer(0, "Ali", "Veli", 1995, 17719093186L));
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServisAdapter());
		customerManager.save(new Customer(1, "Engin", "Demiroğ", 1985, 28861499108L));
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong("28861499108"), "Engin", "Demiroğ", 1985);
		System.out.println("Doğrulama : " + (result ? "başarılı" : "başarısız"));

	}

}
