package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    Contact contact = new Contact();

    void addContact() {
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
    }
}
