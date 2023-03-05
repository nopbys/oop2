
/**
 *
 * @author popo
 */
public class Employee  {
    //attriubte
    private String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    //method
    public boolean equals(Employee e){
        if(this.name.equals(e.getName())){
            return true;
        }
        else{
            return false;
        }
    }
    public void eat(Food f){
        energy +=f.getEnergy();
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public String getName(){
        return name;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public String getNationality(){
        return nationality;
    }
    public int getEnergy(){
        return energy;
    }
    public boolean buyFood(Seller s){
        Food a1;
        a1 = s.sell(this);
        if(a1!= null){
            this.eat(a1);
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return ("My name is "+this.name+"\nI have "+ this.energy+" left.\n have a balance of "+this.wallet.getBalance()+"baht.");
    }
    
}
