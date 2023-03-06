/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author popo
 */
public abstract class Vehicle {
    protected double fuel;
    
    public Vehicle(){
        this(0.0);
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public Vehicle(double fuel){
        this.fuel = fuel;
    }
    public void addFuel(double fuel){
        if(fuel>0){
            this.fuel +=fuel;
        }
        else{
            System.out.println("Fuel is empty.");
        }
    }
    public abstract void honk();
}
