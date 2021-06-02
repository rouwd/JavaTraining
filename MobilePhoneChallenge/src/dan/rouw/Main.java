package dan.rouw;

public class Main {

    public static void main(String[] args) {
        MobilePhone iPhone = new MobilePhone("123-456-7890");
        Contact Dan = new Contact("Dan", "123");
        Contact John = new Contact("John", "456");
        Contact Joe = new Contact("Joe", "789");
        Contact Mary = new Contact("Mary", "000");
        Contact Dan2 = new Contact("Dan", "123");
        System.out.println(iPhone.addNewContact(Dan));
        System.out.println(iPhone.addNewContact(John));
        System.out.println(iPhone.addNewContact(Dan2));
        iPhone.printContacts();

//        System.out.println(iPhone.addNewContact(Joe));
//        iPhone.printContacts();
//
//        System.out.println(iPhone.updateContact(Dan,Mary));
//        iPhone.printContacts();
//
//        System.out.println(iPhone.updateContact(Joe,Mary));
//        iPhone.printContacts();
//
//        System.out.println(iPhone.removeContact(Dan));
//        iPhone.printContacts();
//
//        Contact c1 = iPhone.queryContact("Mary");
//        System.out.println(c1.getName());

    }
}
