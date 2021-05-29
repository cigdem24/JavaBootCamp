package inheritanceDemo;

public class KrediUI {

	/*
	 * KÖTÜ KOD public void krediHesapla(OgretmenKrediManager ogretmenKrediManager)
	 * { ogretmenKrediManager.hesapla(); }
	 */

	public void krediHesapla(BaseKrediManager[] baseKrediManager) {

		for (BaseKrediManager baseKrediManager2 : baseKrediManager) {
			baseKrediManager2.hesapla();
		}
	}

	// Base Tarımında Öğretmeninde referansını tutabilir.

}
