import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    void testValidContractCreation() {
        Contact contact = new Contact("12345", "Andrew", "Lemus", "1234567890", "123 Main St");
        assertEquals("12345", contact.getContactID());
        assertEquals("Andrew", contact.getFirstName());
        assertEquals("Lemus", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    void testInvalidContactID() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Andrew", "Lemus", "1234567890", "123 Main St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678909", "Andrew", "Lemus", "1234567890", "123 Main St"));
    }
}
