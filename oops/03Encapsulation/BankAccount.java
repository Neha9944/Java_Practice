
 class User {

    //instance variable
    private String accountHolder;
    private double balance;

    //constructor
    User(String accHolder, double bal){
        this.accountHolder = accHolder;
        this.balance = bal;
    }

    //getter method to get balance
   public double getBalance(){
        return balance;
    }

    //setter method to set balance 
    public void setBalance(double amount){
        if(amount >= 0){
            this.balance = amount;
        }else{
            System.out.println("Invalid amount");
        }
    }

    //display account details
    void showAccountDetails(){
        System.out.println("Account Holder :" +accountHolder);
        System.out.println("Available Balance :" +balance);
    }   
}

public class BankAccount {

     public static void main(String[] args) {
       
        //object creation
        User user1 = new User("Niharika", 45000);

        user1.showAccountDetails();

        user1.setBalance(60000);

        System.out.println(user1.getBalance());

        user1.setBalance(-1000);

    }
    
}