/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objects;

import java.util.ArrayList;

/**
 *
 * @author Nelson Mendes
 */
public class Machine {
    
    public ArrayList<Product> machineProducts = new ArrayList<Product>();
    public double _1P = 0;
    public double _2P= 0;
    public double _5P= 0;
    public double _10P= 0;
    public double _20P= 0;
    public double _50P= 0;
    public double L1= 0;
    public double L2= 0;
      
    public Machine(){
        _1P=10;
        _2P=10;
        _5P=20;
        _10P=20;
        _20P=25;
        _50P=25;
        L1=50;
        L2=50;
        
        machineProducts.add(new Product(1, "Coca Cola 1", 1.15));
        machineProducts.add(new Product(2, "Coca Cola 2", 1.15));
        machineProducts.add(new Product(3, "Coca Cola 3", 1.15));
        machineProducts.add(new Product(4, "Coca Cola 4", 1.15));
        machineProducts.add(new Product(5, "Sneakers 1", 0.85));
        machineProducts.add(new Product(6, "Sneakers 2", 0.85));
        machineProducts.add(new Product(7, "Sneakers 3", 0.85));
        machineProducts.add(new Product(8, "Sprite 1", 1.39));
        machineProducts.add(new Product(9, "Sprite 2", 1.39));
        machineProducts.add(new Product(10, "Spirte 3", 1.39));
        machineProducts.add(new Product(11, "Twix 1", 0.99));
        machineProducts.add(new Product(12, "Twix 2", 0.99));
        machineProducts.add(new Product(13, "Lemon Ice Tea 1", 1.20));
        machineProducts.add(new Product(14, "Lemon Ice Tea 2", 1.20));
        machineProducts.add(new Product(15, "Lemon Ice Tea 2", 1.20));
    }
    
    public void removeProduct(Product p){
        machineProducts.remove(p);
    }
    
}
