package Exemplos pro trabalho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber;
    }
}

public class ContactBook {
    private List<Contact> contacts;

    public ContactBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
    }

    public void editContact(String name, String newPhoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setPhoneNumber(newPhoneNumber);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact found: " + contact);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void displayContacts() {
        System.out.println("Contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. Display Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber);
                    contactBook.addContact(newContact);
                    System.out.println("Contact added.");
                    break;
                case 2:
                    System.out.print("Enter name of contact to remove: ");
                    String removeName = scanner.nextLine();
                    contactBook.removeContact(removeName);
                    System.out.println("Contact removed.");
                    break;
                case 3:
                    System.out.print("Enter name of contact to edit: ");
                    String editName = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    contactBook.editContact(editName, newPhoneNumber);
                    break;
                case 4:
                    System.out.print("Enter name of contact to search: ");
                    String searchName = scanner.nextLine();
                    contactBook.searchContact(searchName);
                    break;
                case 5:
                    contactBook.displayContacts();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}

