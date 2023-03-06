
public class CheckingAccount extends Account {
    private double credit;
    
    public CheckingAccount(){
        super(0,"");
        credit = 0;
    }
    public CheckingAccount(double balance,String name ,double credit){
        super(balance, name); 
        this.credit = credit;
    }
    public void setCredit(double credit){
        if(credit>0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer");
        }
    }
    public double getCredit(){
        return credit;
    }
    public void withdraw(double a) {
        if ((a > 0) & (getBalance()-a>0)) {
            setBalance(getBalance()-a);
            System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
        }
        else if ((a > 0) & (getBalance()-a<0 & (getBalance()+getCredit())-a>0)) {
            setBalance(0);
            setCredit(getCredit()-(a-getBalance()));
            System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
        }
        else {
            System.out.println("Not enough money!");
        }
    }
    public void withdraw(String a) {
        double d = Double.parseDouble(a);
        withdraw(d);
    }
    public String toString(){
        return ("The "+this.name+" account has "+this.balance+" baht and "+credit+" credits.");
    }
}
