package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contact> list = new ArrayList<>();
    Contact contact = new Contact();

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName: ");
        String firstName = scanner.next();
        System.out.println("Enter lastName: ");
        String lastName = scanner.next();
        System.out.println("Enter address: ");
        String address = scanner.next();
        System.out.println("Enter the city name: ");
        String city = scanner.next();
        System.out.println("Enter State name: ");
        String state = scanner.next();
        System.out.println("Enter zip code: ");
        String zip = scanner.next();
        System.out.println("Enter Phone number: ");
        String phoneNumber = scanner.next();
        System.out.println("Enter email id: ");
        String emailId = scanner.next();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmailId(emailId);
        list.add(contact);
    }
    public void editContact() {
        System.out.println("Enter the first name of the contact to edit :");
        String name = scanner.next();
        for (Contact item: list) {
            if (item.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("Enter firstName: ");
                String firstName = scanner.next();
                System.out.println("Enter lastName: ");
                String lastName = scanner.next();
                System.out.println("Enter address: ");
                String address = scanner.next();
                System.out.println("Enter the city name: ");
                String city = scanner.next();
                System.out.println("Enter State name: ");
                String state = scanner.next();
                System.out.println("Enter zip code: ");
                String zip = scanner.next();
                System.out.println("Enter Phone number: ");
                String phoneNumber = scanner.next();
                System.out.println("Enter email id: ");
                String emailId = scanner.next();
                item.setFirstName(firstName);
                item.setLastName(lastName);
                item.setAddress(address);
                item.setCity(city);
                item.setState(state);
                item.setZip(zip);
                item.setPhoneNumber(phoneNumber);
                item.setPhoneNumber(phoneNumber);
                item.setEmailId(emailId);
            } else {
                System.out.println("Entered contact is not available in the address book: ");
            }
        }
    }
    public void deleteContact() { //This method is to delete a contact by its first name.
        System.out.println("Enter the first name of the contact to delete the contact :");
        String name = scanner.next();
        for (Contact item: list) {
            if (item.getFirstName().equalsIgnoreCase(name)) {
                list.remove(item);
                System.out.println("The contact with name : "+name +" is deleted from the address book:");
            }
        }
    }
    public void addMultipleContact() { // we are adding multiple contact to the list.
        System.out.println("How many contact you want to add ? Enter number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("Enter First name to check Whether same name is already exist in the Address Book: ");
            String name = scanner.next();
            for (Contact item: list) {
                if (item.getFirstName().equalsIgnoreCase(name)) {
                    System.out.println("Sorry ! Given name is already exist in the address book:");
                } else {
                    System.out.println("You can add a contact to the address book. Please fill these details. ");
                    addContact();
                }
            }
        }
    }
    public void displayListOfContact () {
        for (Contact items: list) {
            System.out.println(items.toString());
        }
    }
}
