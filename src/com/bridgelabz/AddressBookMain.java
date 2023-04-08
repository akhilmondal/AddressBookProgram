package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        AddressBook addressBookObj = new AddressBook();
        addressBookObj.addressBookOperations();
        addressBookObj.displayMap();
    }
}
