/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objects;


/**
 *
 * @author Nelson Mendes
 */
public class Product {
    private int id;
    private String name;
    private double value;

    public Product(int id, String name, double value){
        this.id=id;
        this.name = name;
        this.value = value;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    @Override
    public String toString()
    {
        return name;
    }
    
}
