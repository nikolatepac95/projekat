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
public class Category {
    private int id_category;
    private String name;

    public Category(int id_category, String name) {
        this.id_category = id_category;
        this.name = name;
    }

    public int getId_category() {
        return id_category;
    }

    public String getName() {
        return name;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" + "id_category=" + id_category + ", name=" + name + '}';
    }
    
    
}
