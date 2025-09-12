package practice_7.contact_book;

import java.util.HashMap;

public class ContactBook {
    // ключ-значение (имя-телефон)
    private HashMap<String, Integer> contacts;

    public ContactBook() {
        this.contacts = new HashMap<>();
    }

    // добавить контакт
    public void addContact(String name, Integer phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    // поиск контакта по имени по имени
    public Integer getPhoneNumber(String name) {
        return contacts.get(name);
    }

    // обновление телефона по имени
    public void updatePhoneNumber(String name, Integer updatedPhoneNumber) {
        contacts.put(name, updatedPhoneNumber);
    }

    public void printContacts() {
        System.out.println("Все контакты:");
        contacts.forEach(
                (name, phoneNumber) -> {
                    System.out.println("имя "+ name + ", телефон "+ phoneNumber);
                }
        );
        System.out.println();
    }


}
