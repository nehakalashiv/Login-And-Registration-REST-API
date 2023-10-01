package com.web.Login.And.Registration.REST.API.dto;

public class CustomerDto {
    private int customerId;
    private String customerName;
    private String email;
    private String dob;
    private String address;
    private String password;
    public CustomerDto() {

    }

    public CustomerDto(int customerId, String customerName, String email, String dob, String address, String password) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.dob = dob;
        this.address = address;
        this.password = password;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
