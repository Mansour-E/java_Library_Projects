package dev.lpa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Contact contact = new Contact("hasan","01748445659");
        Contact contact1 = new Contact("Rozi" , "12345");
        Contact contact2 = new Contact("Ehsan" , "54321");
        Contact contact3 = new Contact("Hadi", "09173068284");

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(contact);
        contacts.add(contact1);
        contacts.add(contact2);

        MobilePhone mobilePhone = new MobilePhone("017484456599" );

        mobilePhone.printContacts();
        if(mobilePhone.addNewContact(new Contact("Hadi" , "09173068284"))){
            contacts.add(contact3);
        }
        mobilePhone.printContacts();

        Contact hadi2 = new Contact("Hadi" , "091730682844");
        mobilePhone.updateContact(hadi2 , contact3);
        mobilePhone.printContacts();

        mobilePhone.removeContact(hadi2);
        mobilePhone.printContacts();

        System.out.println(mobilePhone.findContact("Rozi"));
        mobilePhone.findContact("Rozi");

        Contact rozi = mobilePhone.queryContact("Rozi");
        ArrayList<Contact> querycontact = new ArrayList<>();

        querycontact.add(rozi);
        System.out.println(querycontact);


    }
}
