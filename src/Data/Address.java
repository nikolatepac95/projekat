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
public class Address {
    private int id_address;
    private String city;
    private String street;
    private String street_number;

    public Address(int id_address, String city, String street, String street_number) {
        this.id_address = id_address;
        this.city = city;
        this.street = street;
        this.street_number = street_number;
    }

    public int getId_address() {
        return id_address;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getStreet_number() {
        return street_number;
    }

    public void setId_address(int id_address) {
        this.id_address = id_address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }

    @Override
    public String toString() {
        return "Address{" + "id_address=" + id_address + ", city=" + city + ", street=" + street + ", street_number=" + street_number + '}';
    }
    
    
         
}
