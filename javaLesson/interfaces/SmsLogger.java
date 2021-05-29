package interfaces;

//implement etmek : Loggeri Smsloggera uyarla demek.
//inheritance de gerekli olan kodları yazmak zorunda değiliz.
//Gerekirse üstüne yazabiliyorduk.Yani override eddebiliyorduk.
//interfacede yazmak zorundayız.
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi : " + message);
	}

}
