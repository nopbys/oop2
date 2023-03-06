/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author popo
 */
public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double a){
        if(a>=0){
            this.balance+=a;
            System.out.println(a+" baht is deposited to "+name+".");
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a){
        if(balance-a<0){
            System.out.println("Not Enough money!");
        }
        else if(a<0){
            System.out.println("Input number must be a positive integer.");
        }
        else if(this.balance>0 && this.balance>a){
            this.balance-=a;
            System.out.println(a+" baht is withdrawn from "+name+".");
        }
    }
    public void showAccount(){
        System.out.println(this.name+" account has "+this.balance+" baht.");
    }
}
