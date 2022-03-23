package com.company;

import java.util.ArrayList;

public class AddressBook{
    Add add = new Add();
    add.firstName = "kota";
    add.lastName = "sukumar";
    add.address = "2,abc colony";
    add.city = "kfj";
    add.state = "aa";
    add.pinCode = 123456;
    add.contactNumber = 987654321;
    add.emailID = "abc@gmail.com";




    ContactStorage contactStorage = new ContactStorage();
        contactStorage.add1(add);

    UserInterface userInterface = new UserInterface();
    ArrayList contactList = contactStorage.getContactList();
        userInterface.print(contactList);
}
