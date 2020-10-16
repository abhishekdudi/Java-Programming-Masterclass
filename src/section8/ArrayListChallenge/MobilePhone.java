package section8.ArrayListChallenge;

import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {

        boolean quit = true;
        int choice;
        printAvailableOptions();
        while(quit) {
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printAvailableOptions();
                    break;
                case 1:
                    phoneBook.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    quit = false;
                    System.out.println("Bye !!!");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    private static void printAvailableOptions() {
        System.out.println("Options ");
        System.out.println("\t 0 - print choice options");
        System.out.println("\t 1 - print list of contacts");
        System.out.println("\t 2 - add new contact");
        System.out.println("\t 3 - update existing contact");
        System.out.println("\t 4 - delete contact");
        System.out.println("\t 5 - search/find contact");
        System.out.println("\t 6 - quit");
    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        if(!phoneBook.searchContact(name)) {
            System.out.print("Enter phone number: ");
            String number = scanner.nextLine();
            phoneBook.addContact(name, number);
        }
        else
            System.out.println("Contact name already exists.");
    }

    private static void modifyContact() {
        System.out.print("Enter name to update: ");
        String name = scanner.nextLine();
        if(phoneBook.searchContact(name)) {
            System.out.print("Enter new number: ");
            String number = scanner.nextLine();
            phoneBook.modifyContact(name, number);
        }
        else
            System.out.println("Contact does not exist.");
    }

    private static void removeContact() {
        System.out.print("Enter name to delete: ");
        String name = scanner.nextLine();
        if(phoneBook.searchContact(name))
            phoneBook.removeContact(name);
        else
            System.out.println("Contact does not exist.");
    }

    private static void queryContact() {
        System.out.print("Enter name to find: ");
        String name = scanner.nextLine();
        if(phoneBook.searchContact(name))
            phoneBook.findContact(name);
        else
        System.out.println("Contact does not exist.");
    }
}
