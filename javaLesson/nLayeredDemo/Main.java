package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entitites.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// concreteler -> somut sınıflar -> iş yapan gerçek sınıflar
		// logger -> abstracts ise databaseLogger -> concretes

		// ArrayList özel bir dizi yapısıdır.
		// İçerisine hangi tipte çalışılacağı belirtilir ->> buna generic yapılar denir
		// Genellikle array lerin yerine arraylist kullanılır.

		// bir projede entitiler hariç neyi newliyorsak sorun yapacak ilerde

		// ilk olarak iş sınıfını new ettik.
		// ProductManagerdaki koşullar sağlanırsa dataaccese bağlanıp ürünü ekleyecek.
		// TO DO: Spring IOC ile çözülecek
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1, 5, "Elma", 5, 1500);
		productService.add(product);

	}

}
