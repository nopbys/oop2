/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author popo
 */
public class Plane extends Vehicle implements Flyable {
    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;
    
    public Plane(){
        this(0.0,"","");
    }
    public Plane(double fuel,String airline,String boeing){
        super(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getBoeing() {
        return boeing;
    }

    public void setBoeing(String boeing) {
        this.boeing = boeing;
    }
    public void startEngine(){
        if(this.getFuel()>=20){
            this.setFuel(this.getFuel()-20);
            System.out.println("Plane’s Engine starts");
        }
        if(this.getFuel()<20){
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine(){
        System.out.println("Plane’s Engine stops");
    }
    public void honk(){
        System.out.println("Weeeeeee");
    }
    public void fly(){
        if(this.getFuel()>=20){
            this.setFuel(this.getFuel()-20);
            System.out.println("Plane Fly");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    public void takeOff(){
        if(this.getFuel()>=10){
            this.setFuel(this.getFuel()-10);
            System.out.println("Plane Already Take off");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    public void landing(){
        if (this.getFuel()>=10){
            this.setFuel(this.getFuel()-10);
            System.out.println("Plane Already to Landing");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
}
