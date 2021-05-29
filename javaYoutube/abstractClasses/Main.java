package abstractClasses;

public class Main {

	public static void main(String[] args) {
		// Abstractlar base i gizlemek içinde kulllanılır.
		// abstract sınıflar asla newlenemez.
		// base sadece kuralları ortaya koyan soyut bir sınıftır.

		GameCalculator gameCalculator = new GameCalculator() {

			@Override
			public void hesapla() {
				// bunu kullanmayın

			}
		};

		GameCalculator gameCalculator2 = new ChildrenCalculator();

	}

}
