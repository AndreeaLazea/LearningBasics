package OOP.Encapsulation;

public class Account {
    private String owner;
    private double balance;
    public Account(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setBalance(Double balance) throws Exception {
        if(balance > 0)
            this.balance = balance;
        else
            throw new Exception("Balance cannot be negative");
    }
    public String getOwner(){
        return this.owner;
    }
    public Double getBalace(){
        return this.balance;
    }
}
