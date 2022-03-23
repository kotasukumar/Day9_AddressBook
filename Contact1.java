package com.company;

public class Contact1 extends AddressBook1 {
    String firstName = "k";
    String lastName = "sukumar";

    @Override
    public String toString() {
        return "Contact1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                ", contactNumber=" + contactNumber +
                ", emailID='" + emailID + '\'' +
                '}';
    }
}
