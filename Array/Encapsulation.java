import java.util.*;;

public class Encapsulation {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public Encapsulation(String name, int number, double amount) {
        this.accountHolderName = name;
        this.accountNumber = number;
        this.balance = amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public String getHolderName(){
        return this.accountHolderName;
    }

    public void amountDeposit(double depositAmount){
        if(depositAmount > 0){
            this.balance += depositAmount;
        }else{
            System.out.println("Invalid deposit amount");
        }
    }

    public void  amountWithdrawal(double withdrawalAmount){
        if(withdrawalAmount > this.balance){
            System.out.println("Insufficient funds");
        }else{
            this.balance -= withdrawalAmount;
        }
    }

    public void displayAccountDetails(double accNo){
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + this.balance);
    } 
}
