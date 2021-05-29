package inheritance;

public class CorporateCustomer extends Customer {

	private String companyName;
	private String taxNumber;

	public CorporateCustomer() {

	}

	public CorporateCustomer(String companyName, String taxNumber) {
		this();
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return this.taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
