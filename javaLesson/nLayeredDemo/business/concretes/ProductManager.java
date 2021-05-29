package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entitites.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// iş kodları yazılır
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		// Eğer böyle sıkı bağlı bir kod yazarsak unit test yapamayız.
		// Depencency injection yapmalıyız. Data accese bağlı ama gevşek bağlı bir
		// sistem olmalı
		// HibernateProductDao dao = new HibernateProductDao();
		// dao.add(product);

		this.productDao.add(product);
		this.loggerService.logToSystem("Loglama mesajı !");

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
