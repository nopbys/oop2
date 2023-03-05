/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author popo
 */
public class Seller extends Employee {
    public Food sell(Employee e){
        Food f1 = new Food();
        if (e.getWallet().getBalance()>=f1.getPrice()){
            this.getWallet().setBalance(this.getWallet().getBalance()+f1.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance()-f1.getPrice());
            return f1;
        }
        else{
            System.out.println("Your money is not enough");
            return null;
        }
    }
}
