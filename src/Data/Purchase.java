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
public class Purchase {
     private int idPurchase;
    private Customer customer;
    private Product product;

    public Purchase(int idPurchase, Customer customer, Product product) {
        this.idPurchase = idPurchase;
        this.customer = customer;
        this.product = product;
    }

    public Purchase(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }
    
}
