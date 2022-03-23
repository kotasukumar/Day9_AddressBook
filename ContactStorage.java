package com.company;

import java.util.ArrayList;

public class ContactStorage {
    private ArrayList contactList = new ArrayList();

    public void add1 (Add add){
        contactList.add(add);
    }

    public  ArrayList getContactList(){
        return contactList;
    }
}
