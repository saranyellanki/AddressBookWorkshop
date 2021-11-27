package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

public class AdvancedAddressBook {
    List<ContactDetails> listOfContacts;

    /**
     * Add contact method adds the contact details to List of contacts
     * @return List of Contacts which are added
     */
    public List<ContactDetails> addContact(){
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("1.CreateContact \n2.Exit");
            int option = sc.nextInt();
            if(option == 1){
                ContactDetails contactDetails = new ContactDetails();
                contactDetails.createContact(sc);
                listOfContacts.add(contactDetails);
                return listOfContacts;
            }else {
                exit = true;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Advanced Address Book");
    }
}
