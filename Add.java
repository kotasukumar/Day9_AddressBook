package com.company;

public class Add {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    long pinCode;
    long contactNumber;
    String emailID;

    @Override
    public String toString() {
        return "Add{" +
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
