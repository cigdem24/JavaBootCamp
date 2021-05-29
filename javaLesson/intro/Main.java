package intro;

public class Main {

	public static void main(String[] args) {

		// camelCase
		// case sensitive - Büyük küçük harf duyarlı
		// CTRL + SHIFT + F -> kod düzenleme kısayolu
		// Don't repeat yourself
		String internetSubeButonu = "İnternet Şubesi";
		System.out.println(internetSubeButonu);

		String[] krediler = { "Hızlı kredi", "mutlu emekli kredisi", "konut kredisi", "çiftçi kredisi" };

		// foreach döngüsü
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		// DEĞER VE REFERANS TİPLER instance
		// DEĞER TİPLER STACKTE TUTULUR. -> int double float boolean
		int number1 = 20, number2 = 30;
		number1 = number2;
		System.out.println(number1);

		// İSTİSNADIR. String referans tiptir. ama değer tip gibi çalışır.
		String letter = "ABC";
		String letter1 = "XYZ";
		letter = letter1;
		letter1 = "123";
		System.out.println(letter);

		// REFERANS TİPLER HEAP TE TUTULUR. -> array , classlar , interface , abstract
		String[] kelimeler = { "Elma", "Armut", "Kivi" };
		String[] sayilar = { "1", "11", "111" };
		kelimeler = sayilar;
		sayilar[0] = "2";
		System.out.println(kelimeler[0]);
		System.out.println(kelimeler[2]);

	}

}
