package dan.rouw;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact) < 0 && findContact(contact.getName()) < 0) {
            this.myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int pos = findContact(oldContact);
        int posNew = findContact(newContact);
        if(pos >= 0 && posNew < 0) {
            this.myContacts.set(pos, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int pos = findContact(contact);
        if(pos >= 0) {
            this.myContacts.remove(pos);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            if(this.myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int pos = findContact(name);
        if(pos >= 0) {
            Contact contact = this.myContacts.get(pos);
            return contact;
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println(i+1 + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

}
