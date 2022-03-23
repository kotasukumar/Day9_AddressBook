package com.company;

public class Contact2 extends AddressBook1{
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return "Contact2{" +
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
