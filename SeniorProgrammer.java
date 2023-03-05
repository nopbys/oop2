/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author popo
 */
public class SeniorProgrammer extends Programmer{
    public void coding(String str){
        if(this.getEnergy()>= 30){
            System.out.println("I am coding about"+str);
            this.setEnergy(this.getEnergy()-5);
            this.setHappiness(this.getHappiness()-5);
        }
        else{
        System.out.println("ZzZzZz");
        this.setEnergy(this.getEnergy()-5);
        this.setHappiness(this.getHappiness()-5);
        }
    }
    public void coding(String str,int num){
        for(int start = 1; start <= num;start++){
            this.coding(str);
        }
    }
    public void compliment(Programmer p){
        p.setHappiness(p.getHappiness()+20);
        System.out.println(p.getName()+"in a good mood");      
    }
    public void blame(Programmer p){
        p.setHappiness(p.getHappiness()-20);
        System.out.println(p.getName()+"in a bad mood");  
    }
}