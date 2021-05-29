package inheritances;

public class Employee {

	private String name;
	private String tel;

	public Employee(String name, String tel) {
		super();
		setName(name);
		setTel(tel);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
