package bold;

import java.util.HashMap;

public class ContactService {
	
	private HashMap<String, Contact> list;
	
	public ContactService() {
		list = new HashMap<>();
	}
	
	//makes a contact and stores them into list
	public void addContact(Contact input) {
		if(list.get(input.getiD()) == null) {
			list.put(input.getiD(), input);
		}
		else {
			throw new IllegalArgumentException("ID not unique");
		}
	}
	
	public void changeContactFirstName(String iD, String input) {
		Contact found = list.get(iD);
		
		if(found == null) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		found.ChangefirstName(input);
	}
	
	public void changeContactLastName(String iD, String input) {
		Contact found = list.get(iD);
		
		if(found == null) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		found.ChangelastName(input);
	}
	
	public void changeContactPhone(String iD, String input) {
		Contact found = list.get(iD);
		
		if(found == null) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		found.Changephone(input);
	}
	
	public void changeContactAddress(String iD, String input) {
		Contact found = list.get(iD);
		
		if(found == null) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		found.Changeaddress(input);
	}
	
	public void deleteContact(String iD) {
		Contact found = list.get(iD);
		
		if(found == null) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		list.remove(iD);
	}
	
	public String ContactToString(String iD) {
		Contact found = list.get(iD);
		
		if(found == null) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		return found.toString();
	}
}