public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer(){
        this("", "", null);
    }
    
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
    }
    
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    
    public CheckingAccount getAcct(){
        return acct;
    }
    
    public String toString(){
        if(acct == null){
            return (firstName + " " + lastName + " doesn’t have account.");
        }
        else{
            return ("The " + firstName + " account has " + acct.balance + " baht and " + acct.getCredit() +" credits.");
        }
    }
    
    public boolean equals(Customer c){
        return firstName.equals(c.firstName) && lastName.equals(c.lastName);
    }
}