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
public class Product {
      private int idProduct = -1;
    private String name;
    private double price;
    private int count;
    private Category category;

    public Product(int idProduct, String name, double price, int count, Category category) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.count = count;
        this.category = category;
    }

    public Product(String name, double price, int count, Category category) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.category = category;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{").append("name=").append(name).append(", price=").append(price).append(", count=").append(count).append(", category=").append(category).append("}");
        return sb.toString();
    }

}
