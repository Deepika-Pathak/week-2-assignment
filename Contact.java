//Simple Contact Management Create a class Contact with fields: name, phoneNumber, emailAddress. Create 3 Contact objects. Print the contact details only if the emailAddress is not empty (use if condition).

public class Contact {
    
    String name;
    String phoneNumber;
    String emailAddress;

    public Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void displayContactDetails() {
        if (emailAddress != null && !emailAddress.isEmpty()) {
            System.out.println("Name: " + name);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email Address: " + emailAddress);
            System.out.println();
        } else {
            System.out.println("Email address is missing for " + name + ".\n");
        }
    }

    public static void main(String[] args) {
       
        Contact contact1 = new Contact("Dipa", "123-456-7890", "dipa@example.com");
        Contact contact2 = new Contact("Ishani", "987-654-3210", "");
        Contact contact3 = new Contact("Sarala", "555-123-4567", "sarala@example.com");

        contact1.displayContactDetails();
        contact2.displayContactDetails();
        contact3.displayContactDetails();
    }
}
