package bold;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	ContactService service;
	
	@BeforeEach
	void setup() {
		service = new ContactService();
	}
	
	@Test
	void addContactTest() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		assertTrue(service.ContactToString("1").equals("1 James Gould 6037809 197"));
	}
	
	@Test
	void addContactTestIDNotUnique() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		});
	}
	
	@Test
	void ChangefNameContactTest() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		service.changeContactFirstName("1", "Jimmy");
		assertTrue(service.ContactToString("1").equals("1 Jimmy Gould 6037809 197"));
	}
	
	@Test
	void ChangefNameContactTestInvalidID() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.changeContactFirstName("2", "Jimmy");
		});
	}
	
	@Test
	void ChangelNameContactTest() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		service.changeContactLastName("1", "Jimmy");
		assertTrue(service.ContactToString("1").equals("1 James Jimmy 6037809 197"));
	}
	
	@Test
	void ChangelNameContactTestInvalidID() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.changeContactLastName("2", "Jimmy");
		});
	}
	
	@Test
	void ChangePhoneContactTest() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		service.changeContactPhone("1", "603878");
		assertTrue(service.ContactToString("1").equals("1 James Gould 603878 197"));
	}
	
	@Test
	void ChangePhoneContactTestInvalidID() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.changeContactPhone("2", "603878");
		});
	}
	
	@Test
	void ChangeAddressContactTest() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		service.changeContactAddress("1", "Jimmy");
		assertTrue(service.ContactToString("1").equals("1 James Gould 6037809 Jimmy"));
	}
	
	@Test
	void ChangeAddressContactTestInvalidID() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.changeContactAddress("2", "197 Old Ashby");
		});
	}
	
	@Test
	void deleteContactTest() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		service.deleteContact("1");
	}
	
	@Test
	void deleteContactTestInvalidID() {
		service.addContact(new Contact("1", "James", "Gould", "6037809", "197"));
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.deleteContact("3");
		});
	}
}
