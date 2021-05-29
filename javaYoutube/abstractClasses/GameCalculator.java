package abstractClasses;

public abstract class GameCalculator {

	// çocuk için kadın için erkek için ayrı hesapla fonksiyonu olsun istiyorsak iki
	// yöntem kullanırız
	// 1. methodu override etmek
	// 2. sınıfı ve methodu abstract yapmak

	// bu şu demek : bu sınıfı extend eden herkes bu methodu kendine uyarlamak
	// zorunda
	public abstract void hesapla();

	public final void gameOver() {
		System.out.println("Oyun bitti");
	}

}
