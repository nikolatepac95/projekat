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
public class Contact_details {
    private int id_contact_details;
    private String email_adress;
    private String phone_number;

    public Contact_details(int id_contact_details, String email_adress, String phone_number) {
        this.id_contact_details = id_contact_details;
        this.email_adress = email_adress;
        this.phone_number = phone_number;
    }

    public void setId_contact_details(int id_contact_details) {
        this.id_contact_details = id_contact_details;
    }

    public void setEmail_adress(String email_adress) {
        this.email_adress = email_adress;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getId_contact_details() {
        return id_contact_details;
    }

    public String getEmail_adress() {
        return email_adress;
    }

    @Override
    public String toString() {
        return "Contact_details{" + "id_contact_details=" + id_contact_details + ", email_adress=" + email_adress + ", phone_number=" + phone_number + '}';
    }
    
    

    public String getPhone_number() {
        return phone_number;
    }
    
    
}
