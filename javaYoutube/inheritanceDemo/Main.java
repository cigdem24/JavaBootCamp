package inheritanceDemo;

public class Main {

	public static void main(String[] args) {

		KrediUI krediUI = new KrediUI();
		BaseKrediManager[] list = new BaseKrediManager[] { new TarimKrediManager(), new AskerKrediManager(),
				new OgretmenKrediManager() };
		krediUI.krediHesapla(list);

	}

}
