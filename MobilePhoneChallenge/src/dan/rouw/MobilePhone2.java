package dan.rouw;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone2 {
    private ArrayList<Contact2> Contacts = new ArrayList<Contact2>();
    private static Scanner scanner = new Scanner(System.in);

    public void addContact(String name, String phoneNumber) {
        Contact2 newContact = new Contact2(name,phoneNumber);
        Contacts.add(newContact);
    }

    public void startUI() {
        boolean quit = false;
        int choice = 0;

        printMenu();
        while (!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printMenu();
                    break;
                case 1:
                    quit = true;
                    break;
                case 2:
                    printContactList();
                    break;
                case 3:
                    addNewContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("Please choose one of these options");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - Quit");
        System.out.println("\t 2 - Print Contact List");
        System.out.println("\t 3 - Add New Contact");
        System.out.println("\t 4 - Update Existing Contact");
        System.out.println("\t 5 - Remove Contact");
    }

    private void printContactList() {
        if( Contacts.size() > 0 ) {
            for (int i = 0; i < Contacts.size(); i++) {
                System.out.println(Contacts.get(i).getInfo());
            }
        } else {
            System.out.println("Contact List is empty");
        }
    }

    private void addNewContact() {
        System.out.printf("Enter the new contact name: ");
        String newName = scanner.nextLine();
        System.out.printf("Enter the new contact phone number: ");
        String newPhone = scanner.nextLine();
        Contacts.add(new Contact2(newName, newPhone));
        System.out.println("Contact added");
    }

    private void updateContact() {
        System.out.printf("Which contact do you want to update? ");
        String removeName = scanner.nextLine();
        int contactPos = findContact(removeName);
        if(contactPos >= 0) {
            System.out.printf("Enter the new contact name: ");
            String newName = scanner.nextLine();
            System.out.printf("Enter the new contact phone number: ");
            String newPhone = scanner.nextLine();
            Contacts.get(contactPos).updateInfo(newName, newPhone);
            System.out.println("Contact updated");
        } else {
            System.out.println("Contact not found");
        }
    }

    private void removeContact() {
        System.out.printf("Which contact do you want to remove? ");
        String removeName = scanner.nextLine();
        int contactPos = findContact(removeName);
        if(contactPos >= 0) {
            Contacts.remove(contactPos);
            System.out.println("Contact removed");
        } else {
            System.out.println("Contact not found");
        }
    }

    private int findContact(String name) {
        for(int i = 0; i < Contacts.size(); i++) {
            if(Contacts.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Contact2> getContacts() {
        return Contacts;
    }


}
