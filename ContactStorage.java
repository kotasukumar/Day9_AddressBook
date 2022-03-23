package com.company;

import java.util.ArrayList;

public class ContactStorage {
    private ArrayList contactList = new ArrayList();

    public void add1 (AddressBook1 addressBook1){
        contactList.add(addressBook1);
    }

    public  ArrayList getContactList(){
        return contactList;
    }
}
