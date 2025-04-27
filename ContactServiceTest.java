import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Andrew", "Lemus", "1234567890", "123 Main St");

        service.addContact(contact);
        assertEquals(contact, service.getContact("12345"));
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Andrew", "Lemus", "1234567890", "123 Main St");

        service.addContact(contact);
        service.deleteContact("12345");
        assertNull(service.getContact("12345"));
    }

    @Test
    void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Andrew", "Lemus", "1234567890", "123 Main St");

        service.addContact(contact);
        service.updateFirstName("12345", "Andrea");
        service.updatePhone("12345", "0123456789");

        assertEquals("Andrea", service.getContact("12345").getFirstName());
        assertEquals("0123456789", service.getContact("12345").getPhone());
    }
}
