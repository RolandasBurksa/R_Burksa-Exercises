package lt.techin;

public class Main {

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("123456789");
        Contact bob = Contact.createContact("Bob", "987654321");
        Contact alice = Contact.createContact("Alice", "16180339");

        mobilePhone.addNewContact(bob);
        mobilePhone.addNewContact(alice);

        mobilePhone.printContacts();

        Contact newAlice = Contact.createContact("Alice", "12345678");
        mobilePhone.updateContact(alice, newAlice);

        mobilePhone.printContacts();

        mobilePhone.removeContact(bob);
        mobilePhone.printContacts();


    }
}
