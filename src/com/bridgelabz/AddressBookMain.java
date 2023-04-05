package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, AddressBook> map = new HashMap<>();

    public static void addressBookOperations() {
        System.out.println("Enter how many addressBook you want to add: ");
        int addressBookNumber = sc.nextInt();
        for (int i = 1; i <= addressBookNumber; i++) {
            AddressBook addressBookObj = new AddressBook();
            System.out.println("Enter the name of your AddressBook: ");
            String addressBookName = sc.next();
            boolean reRun = true;
            do {
                System.out.println("Enter the operation number to perform the task. ");
                System.out.println(" 1. Add Contact \n 2. Edit Contact \n 3. Delete Contact \n 4. Add Multiple Contact \n 5. Display Contact \n 0. To terminate the program and add another Addressbook to the Hashmap. \n");
                int select = sc.nextInt();
                switch (select) {
                    case 1:
                        addressBookObj.addContact();
                        break;
                    case 2:
                        addressBookObj.editContact();
                        break;
                    case 3:
                        addressBookObj.deleteContact();
                        break;
                    case 4:
                        addressBookObj.addMultipleContact();
                        break;
                    case 5:
                        addressBookObj.displayListOfContact();
                        break;
                    case 0:
                        reRun = false;
                    default:
                        System.out.println("The program is terminated. Thank you for using Address Book Program ! ");
                }
            } while (reRun);
            map.put(addressBookName, addressBookObj);
        }
    }

    public static void displayMap() {
        for (Map.Entry<String, AddressBook> entry : map.entrySet()) {
            String key = entry.getKey();
            AddressBook value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        addressBookOperations();
        displayMap();
    }
}
