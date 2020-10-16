package section8.ArrayListChallenge;

import java.util.ArrayList;

public class PhoneBook {

    private static ArrayList<Contact> contactList = new ArrayList<>();

    public static ArrayList<Contact> getContactList() {
        return contactList;
    }

    public static void setContactList(ArrayList<Contact> contactList) {
        PhoneBook.contactList = contactList;
    }

    public void printContactList() {
        System.out.println("You have "+ contactList.size() + " items in your phone book");

        for (Contact contact : contactList) {
            System.out.println(contact.getName() + " : " +
                    contact.getPhoneNumber());
        }
    }

    public void addContact(String name, String number) {
        Contact newContact = new Contact(name, number);
        contactList.add(newContact);
        System.out.println("\nContact Added.");
    }

    public void modifyContact(String name, String number) {
        int position = contactPosition(name);
        Contact contact = contactList.get(position);
        contact.setName(name);
        contact.setPhoneNumber(number);
        System.out.println("\nContact Updated.");
    }

    public void removeContact(String name) {
        int position = contactPosition(name);
        contactList.remove(position);
        System.out.println("\nContact deleted.");
    }

    public void findContact(String name) {
        int position = contactPosition(name);
        Contact contact = contactList.get(position);
        System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
    }

    public boolean searchContact(String name) {
        return (contactPosition(name) >= 0);
    }

    private int contactPosition(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            if(contactList.get(i).getName().equalsIgnoreCase(name))
                return i;
        }

        return -1;
    }
}
