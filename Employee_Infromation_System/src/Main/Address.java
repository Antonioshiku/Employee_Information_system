package Main;

public class Address extends Employee {
        private String Region,postalCode;
	public Address() {
		
	}
	public Address(String region, String postalCode) {
		super();
		Region = region;
		this.postalCode = postalCode;
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
