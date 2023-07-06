package Main;

public class Address extends Employee {
	private String Region, postalCode, Addr_code;

	public Address() {

	}

	public Address(String region, String postalCode, String Addr_code) {
		Region = region;
		this.postalCode = postalCode;
		this.Addr_code = Addr_code;
	}

	public String getAddr_code() {
		return Addr_code;
	}

	public void setAddr_code(String addr_code) {
		Addr_code = addr_code;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
