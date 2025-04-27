import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contact == null || contacts.containsKey(contact.getContactID()))
            throw new IllegalArgumentException("Contact ID must be unique and not null.");
        contacts.put(contact.getContactID(), contact);
    }

    public void deleteContact(String contactID) {
        if (!contacts.containsKey(contactID))
            throw new IllegalArgumentException("Contact ID not found.");
        contacts.remove(contactID);
    }

    public void updateFirstName(String contactID, String newFirstName) {
        if (!contacts.containsKey(contactID))
            throw new IllegalArgumentException("Contact ID not found.");
        contacts.get(contactID).setFirstName(newFirstName);
    }

    public void updateLastName(String contactID, String newLastName) {
        if (!contacts.containsKey(contactID))
            throw new IllegalArgumentException("Contact ID not found.");
        contacts.get(contactID).setLastName(newLastName);
    }

    public void updatePhone(String contactID, String newPhone) {
        if (!contacts.containsKey(contactID))
            throw new IllegalArgumentException("Contact ID not found.");
        contacts.get(contactID).setPhone(newPhone);
    }

    public void updateAddress(String contactID, String newAddress) {
        if (!contacts.containsKey(contactID))
            throw new IllegalArgumentException("Contact ID not found.");
        contacts.get(contactID).setAddress(newAddress);
    }

    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }
}
