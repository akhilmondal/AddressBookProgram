package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook1 = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation number to perform the task. ");
        System.out.println(" 1. Add Contact \n 2. Edit Contact \n 3. Delete Contact \n 4. Add Multiple Contact \n");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                addressBook1.addContact();
                System.out.println(addressBook1.contact.getFirstName());
                System.out.println(addressBook1.contact.getLastName());
                System.out.println(addressBook1.contact.getAddress());
                System.out.println(addressBook1.contact.getCity());
                System.out.println(addressBook1.contact.getState());
                System.out.println(addressBook1.contact.getZip());
                System.out.println(addressBook1.contact.getPhoneNumber());
                System.out.println(addressBook1.contact.getEmailId());
                break;
            case 2:
                addressBook1.editContact();
                System.out.println(addressBook1.contact.getFirstName());
                System.out.println(addressBook1.contact.getLastName());
                System.out.println(addressBook1.contact.getAddress());
                System.out.println(addressBook1.contact.getCity());
                System.out.println(addressBook1.contact.getState());
                System.out.println(addressBook1.contact.getZip());
                System.out.println(addressBook1.contact.getPhoneNumber());
                System.out.println(addressBook1.contact.getEmailId());
                break;
            case 3:
                addressBook1.deleteContact();
                System.out.println(addressBook1.contact.getFirstName());
                System.out.println(addressBook1.contact.getLastName());
                System.out.println(addressBook1.contact.getAddress());
                System.out.println(addressBook1.contact.getCity());
                System.out.println(addressBook1.contact.getState());
                System.out.println(addressBook1.contact.getZip());
                System.out.println(addressBook1.contact.getPhoneNumber());
                System.out.println(addressBook1.contact.getEmailId());
                break;
            case 4:
                addressBook1.addMultipleContact();
                addressBook1.addMultipleContact();
                System.out.println(addressBook1.list);
                break;
            default:
                System.out.println("Entered option is not available in the program. ");
        }
    }
}
