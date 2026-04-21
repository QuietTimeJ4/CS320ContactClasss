package bold;

public class Contact {
	final private String iD;
	
	private String firstName = "N/A",
	lastName = "N/A",
	phone = "N/A",
	address = "N/A";
	
	Contact(String iD, String firstName, String lastName, String phone, String address){
		if(iD == null || iD.length() > 10) {
			throw new IllegalArgumentException("Invalid iD");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		if(phone == null || phone.length() > 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		for(int i = 0; i < phone.length(); i++) {
			if(!(Character.isDigit(phone.charAt(i)))) {
				throw new IllegalArgumentException("Invalid phone");
			}
		}
		
		this.iD = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	public String getiD() {
		return iD;
	}
	
	public void ChangefirstName(String newfirstName) {
		if(newfirstName == null || newfirstName.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		
		firstName = newfirstName;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void ChangelastName(String newlastName) {
		if(newlastName == null || newlastName.length() > 10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		
		lastName = newlastName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void Changephone(String newphone) {
		if(newphone == null || newphone.length() > 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		for(int i = 0; i < newphone.length(); i++) {
			if(!(Character.isDigit(newphone.charAt(i)))) {
				throw new IllegalArgumentException("Invalid phone");
			}
		}
		
		phone = newphone;
	}
	
	public String getphone() {
		return phone;
	}
	
	public void Changeaddress(String newaddress) {
		if(newaddress == null || newaddress.length() > 30) {
			throw new IllegalArgumentException("Invalid phone");
		}
		address = newaddress;
	}
	
	public String getaddress() {
		return address;
	}
	
	public String toString() {
		return iD + " " + firstName + " " + lastName + " " + phone + " " + address;
	}
}
