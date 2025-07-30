package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact newContact , Contact oldContact){

        if(myContacts.contains(oldContact)){
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }else{
            return false;
        }

    }

    public boolean removeContact(Contact oldContact){
        if(myContacts.contains(oldContact)){
            myContacts.remove(myContacts.indexOf(oldContact));
            return true;
        }
        return false;
    }
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {

        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name){

        for(Contact c : myContacts){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
    public void printContacts(){
        int count = 1;
        System.out.println("Contact List: ");
        for(Contact c : myContacts){
            System.out.print(
                               count+". "+ c.getName() + " -> " + c.getPhoneNumber()+"\n"
                                );
            count++;
        }

    }
}
