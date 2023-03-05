/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author popo
 */
public class Food {
    private int energy = 10;
    private double price = 50;
    
    public void setPrice(double price){
        if (price<= this.price){
            this.price = price;
        }
        else{
            System.out.println("Cannot update the food price.");
        }
    }
    public double getPrice(){
        return this.price;
    }
    public int getEnergy(){
        return this.energy;
    }
}
