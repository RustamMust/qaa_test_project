package practice_7.homework.linked_hash_map;

import java.util.LinkedHashMap;

public class ContactBook {
    LinkedHashMap<String, Integer> contactBook;

    public ContactBook() {
        this.contactBook = new LinkedHashMap<>();
    }

    public void addContact(String name, Integer phoneNumber) {
        contactBook.put(name, phoneNumber);
    }

    public void findContact(String name) {
        if (contactBook.containsKey(name)) {
            System.out.println("Имя " + name + " есть в телефонной книге.");
        } else {
            System.out.println("Имени " + name + " нет в телефонной книге.");
        }
    }
}
