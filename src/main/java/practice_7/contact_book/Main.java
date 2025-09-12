package practice_7.contact_book;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.addContact("Никита" ,123332);
        contactBook.addContact("Коля" ,234);

        contactBook.printContacts();

        contactBook.updatePhoneNumber("Коля", 6432);
        contactBook.printContacts();
    }
}
