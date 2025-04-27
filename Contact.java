public class Contact {
    private final String contactID;     // Not updatable
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        if (contactID == null || contactID.length() > 10)
            throw new IllegalArgumentException("Contact ID cannot be longer than 10 characters or blank.");
        if (firstName == null || contactID.length() > 10)
            throw new IllegalArgumentException("First Name cannot be longer than 10 characters or blank.");
        if (lastName == null || contactID.length() > 10)
            throw new IllegalArgumentException("Last Name cannot be longer than 10 characters or blank.");
        if (phone == null || !phone.matches("\\d{10}"))
            throw new IllegalArgumentException("Phone Number has to be 10 digits long.");
        if (address == null || contactID.length() > 30)
            throw new IllegalArgumentException("Address cannot be longer than 30 characters or blank.");

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters
    public String getContactID() { return contactID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    // Setters
    public void setFirstName(String firstName) {
        if (firstName == null || contactID.length() > 10)
            throw new IllegalArgumentException("First Name cannot be longer than 10 characters or blank.");
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        if (lastName == null || contactID.length() > 10)
            throw new IllegalArgumentException("Last Name cannot be longer than 10 characters or blank.");
        this.lastName = lastName;
    }
    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}"))
            throw new IllegalArgumentException("Phone Number has to be 10 digits long.");
        this.phone = phone;
    }
    public void setAddress(String address) {
        if (address == null || contactID.length() > 30)
            throw new IllegalArgumentException("Address cannot be longer than 30 characters or blank.");
        this.address = address;
    }
}
