package oopIntro;

public class Main {

	public static void main(String[] args) {

		// snippedlar -> sys + CTRL + SPACE
		//
		Product product1 = new Product(0, "Lenova", 14000, "64 GB RAM", 10); // İnstance creating , referans oluşturma

		Product product2 = new Product(); // İnstance creating , referans oluşturma
		product2.setId(1);
		product2.setName("Asus");
		product2.setDetail("32 GB Ram");
		product2.setUnitPrice(16000);
		product2.setDiscount(10);

		System.out.println(product2.getUnitPriceAfterDiscount());

		Product[] products = { product1, product2 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		System.out.println(products.length);

		Category category1 = new Category();
		category1.setId(0);
		category1.setName("Bilgisayar");

		Category category2 = new Category();
		category2.setId(1);
		category2.setName("Ev Bahçe");

		System.out.println(category2.getName());

		ProductManager productManager = new ProductManager();
		// Product'ın adresini gönderiyoruz
		productManager.addToCart(product1);
		System.out.println();

	}

}
