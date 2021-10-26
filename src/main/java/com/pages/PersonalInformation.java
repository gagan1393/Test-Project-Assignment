package com.pages;

public class PersonalInformation {

    private String FirstName;
    private String LastName;
    private String Password;
    private String Company;
    private String Address;
    private String City;
    private String State;
    private String Pincode;
    private String PhoneNumber;
    private String AddressAlias;

    public PersonalInformation(String firstName, String lastName, String password, String company, String address, String city, String state, String pincode, String phoneNumber, String addressAlias) {
        FirstName = firstName;
        LastName = lastName;
        Password = password;
        Company = company;
        Address = address;
        City = city;
        State = state;
        Pincode = pincode;
        PhoneNumber = phoneNumber;
        AddressAlias = addressAlias;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPincode() {
        return Pincode;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddressAlias() {
        return AddressAlias;
    }

    public void setAddressAlias(String addressAlias) {
        AddressAlias = addressAlias;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }


}
