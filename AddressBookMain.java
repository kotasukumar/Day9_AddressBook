package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Contact1 contact1 = new Contact1();
        contact1.address = "2,abc colony";
        contact1.city = "kfj";
        contact1.state = "aa";
        contact1.pinCode = 123456;
        contact1.contactNumber = 987654321;
        contact1.emailID = "abc@gmail.com";

        Contact2 contact2 = new Contact2();
        System.out.println("Enter details of contact2 - first name, last name, address, city, state, pin code, contact number and email id: ");
        Scanner scanner = new Scanner(System.in);
        contact2.firstName = scanner.next();
        contact2.lastName = scanner.next();
        contact2.address = scanner.next();
        contact2.city = scanner.next();
        contact2.state = scanner.next();
        contact2.pinCode = scanner.nextLong();
        contact2.contactNumber = scanner.nextLong();
        contact2.emailID = scanner.next();

        ContactStorage contactStorage = new ContactStorage();
        contactStorage.add1(contact1);
        contactStorage.add1(contact2);

        UserInterface userInterface = new UserInterface();
        ArrayList contactList = contactStorage.getContactList();
        userInterface.print(contactList);
    }
}
