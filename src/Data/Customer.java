/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Vlada
 */
public class Customer {
     private String username;
    private String name;
    private String surname;
    private double credit;
    private Contact_details contactDetails;
    private Address address;

    public Customer(String username, String name, String surname, double credit, Contact_details contactDetails, Address address) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.credit = credit;
        this.contactDetails = contactDetails;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Contact_details getContactDetails() {
        return contactDetails;
    }

    public void setContact_details(Contact_details contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{").append("username=").append(username).append(", name=").append(name)
        .append(", surname=").append(surname).append(", credit=").append(credit)
        .append(", contactDetails=").append(contactDetails).append(", address=").append(address).append("}");
        return sb.toString();
    }
}
