package OOP.Encapsulation;

public class main {
    public static void main(String[] args){
        //ENCAPSULATION
        // = OOP principle that  restricts direct access to
        //some of the object's components
        //to prevent accidental modifications
        //of data
        // = * private variables can only be accessed
        //within the same class
        // = * public variables can be accessed
        // from any class from the project
        // = * protected variables can only be
        // accessed within the same class OR
        //from DERIVATE classes, where they become
        //private.


        Account account = new Account("Andreea", 23.45);
        System.out.println(account.getOwner());
        System.out.println(account.getBalace());
        account.setOwner("Andreea E.");
        //By using encapsulation
        //we also ensure no one can have access to do modifications
        //that are mistakes,
        //such as adding a negative balance
        try{
            account.setBalance(-100.0);
        }
        catch(Exception e){
            System.out.println("Balance cannot be negative");
        }
    }
}
