package classes;

public class Main {

	public static void main(String[] args) {

		// eşitliğin sol tarafı Stackte tutulurken , sağ tarafı heapte tutulur. Nesne
		// HEAPTE çalışıyor aslında. ADD REMOVE işlemleri
		// customerManager bir referans numarasıyla tutulur.
		// onu newlediğimiz zaman heapte onun için bir ayrılır.
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();

		// Şuan customerManager 101 numaralı referans numarası ile tutuluyor diyelim.
		// customerManager2 de 102 numaralı referans numarası ile tutuluyor diyelim.
		// C deki pointer mantığı

		customerManager = customerManager2;
		// cm2 nin referans numarasını cm ye atıyoruz.

		customerManager2.add();
		customerManager2.remove();

		// Herhangi bir referansı tutan kalmadıysa bir süre sonra GARBAGE COLLECTOR bunu
		// siler.
		// Bellkete bir nesneyi newlenemek pahalıdır. Sadece ihtiyaç duyulduğunda
		// newlenir.

	}

}
