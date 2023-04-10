package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        AddressBook addressBookObj = new AddressBook();
        addressBookObj.addressBookOperations();
        addressBookObj.displayMap();
        System.out.println("Choose the option to do operations on your Address Book.");
        int option = scanner.nextInt();
        switch (option) {
            case 1:

        }
    }
}
