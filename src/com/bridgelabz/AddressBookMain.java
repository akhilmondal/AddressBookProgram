package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    static AddressBook addressBook1 = new AddressBook();
    static HashMap<String, AddressBook> map = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        boolean reRun = true;

        do {
            System.out.println("Enter the operation number to perform the task. ");
            System.out.println(" 1. Add Contact \n 2. Edit Contact \n 3. Delete Contact \n 4. Add Multiple Contact \n 5. Display Contact \n 0. To terminate the program \n");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    addressBook1.addContact();
                    break;
                case 2:
                    addressBook1.editContact();
                    break;
                case 3:
                    addressBook1.deleteContact();
                    break;
                case 4:
                    addressBook1.addMultipleContact();
                    addressBook1.addMultipleContact();
                    break;
                case 5:
                    addressBook1.displayListOfContact();
                    break;
                case 0:
                    reRun = false;
                default:
                    System.out.println("Entered option is not available in the program. ");
            }
        }while (reRun);
       map.put("AddressBook1",addressBook1); // Adding addressbook to the hashMap
    }
}
