package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entitites.concretes.Product;

public interface ProductService {
	// servisler genel olarak iş sınıfının interfaceleridir

	void add(Product product);

	List<Product> getAll();
}
