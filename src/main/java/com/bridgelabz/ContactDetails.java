package com.bridgelabz;

import java.util.Scanner;

public class ContactDetails {
    private String firstname, lastname, address, city, state, zipcode, phone, email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void createContact(Scanner sc){
        System.out.print("Enter First Name : ");
        setFirstname(sc.nextLine());
        System.out.print("Enter Last Name: ");
        setLastname((sc.nextLine()));
        System.out.print("Enter Address: ");
        setAddress(sc.nextLine());
        System.out.print("Enter City: ");
        setCity(sc.nextLine());
        System.out.print("Enter state: ");
        setState(sc.nextLine());
        System.out.print("Enter zipcode: ");
        setZipcode(sc.nextLine());
        System.out.print("Enter Phone number: ");
        setPhone(sc.nextLine());
        System.out.print("Enter Email Id: ");
        setEmail(sc.nextLine());
    }
}
