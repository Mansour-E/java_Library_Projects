package dev.lpa;

import java.util.ArrayList;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static ArrayList<Contact> createContacts(String name , String phoneNumber) {

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(name, phoneNumber));
        return contacts;
    }
}
