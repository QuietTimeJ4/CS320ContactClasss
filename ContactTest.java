package bold;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void TestContactConstructor() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		assertTrue(contact.getiD().equals("1"));
		assertTrue(contact.getfirstName().equals("James"));
		assertTrue(contact.getlastName().equals("Gould"));
		assertTrue(contact.getphone().equals( "3873339075"));
		assertTrue(contact.getaddress().equals("578 New Iqswich Dr New Iqswish"));
	}
	
	@Test
	void TestContactConstuctorFNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "James Gould", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		});
	}
	
	@Test
	void TestContactConstructorFNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		});
	}
	
	@Test
	void TestContactConstuctorLNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "James", "James Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		});
	}
	
	@Test
	void TestContactConstructorLNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "James", null, "3873339075", "578 New Iqswich Dr New Iqswish");
		});
	}
	
	@Test
	void TestContactConstuctorPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "James", "Gould", "38733390750", "578 New Iqswich Dr New Iqswish");
		});
	}
	
	@Test
	void TestContactConstructorPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "James", "Gould", null, "578 New Iqswich Dr New Iqswish");
		});
	}
	
	@Test
	void TestContactConstructorLetterPhone() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "James", "Gould", "387333907a", "578 New Iqswich Dr New Iqswish");
		});
	}
	
	@Test
	void TestContactConstuctorAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish ");
		});
	}
	
	@Test
	void TestContactConstructorAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "James", "Gould", "3873339075", null);
		});
	}
	
	@Test
	void TestContactChangeFName() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		assertDoesNotThrow(() -> {
			contact.ChangefirstName("Jimmy");
		});
	}
	
	@Test
	void TestContactChangeFNameToLong() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.ChangefirstName("James Gould");
		});
	}
	
	@Test
	void TestContactChangeFNameNull() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.ChangefirstName(null);
		});
		
	}
	
	@Test
	void TestContactChangeLName() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		assertDoesNotThrow(() -> {
			contact.ChangelastName("Goold");
		});
	}
	
	@Test
	void TestContactChangeLNameToLong() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.ChangelastName("James Gould");
		});
	}
	
	@Test
	void TestContactChangeLNameNull() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.ChangelastName(null);
		});
		
	}
	
	@Test
	void TestContactChangePhone() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		assertDoesNotThrow(() -> {
			contact.ChangefirstName("Jimmy");
		});
	}
	
	@Test
	void TestContactChangePhoneToLong() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.Changephone("38733390750");
		});
	}
	
	@Test
	void TestContactChangePhoneNull() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.Changephone(null);
		});
		
	}
	
	@Test
	void TestContactChangePhoneLetter() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.Changephone("603780a");
		});
	}
	
	@Test
	void TestContactChangeAddress() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		assertDoesNotThrow(() -> {
			contact.Changeaddress("578 New Iqswich Dr New Iqswish");
		});
	}
	
	@Test
	void TestContactChangeAddressToLong() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.Changeaddress("578 New Iqswich Dr New Iqswish ");
		});
	}
	
	@Test
	void TestContactChangeAddressNull() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.Changeaddress(null);
		});
	}
	
	@Test
	void TestContactToString() {
		Contact contact = new Contact("1", "James", "Gould", "3873339075", "578 New Iqswich Dr New Iqswish");
		assertTrue(contact.toString().equals("1 James Gould 3873339075 578 New Iqswich Dr New Iqswish"));
	}
}
