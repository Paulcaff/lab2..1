import javax.swing.*;

public class BankAccount {
    private String accnum;
    private double balance;
    private Person customer;

    public double getBalance() {
        return balance;
    }

    public String getAccnum() {
        return accnum;
    }

    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public BankAccount(){
      this.accnum = "20698734";
      this.balance = 0;
      this.customer = customer;
    }

    public BankAccount(String accnum,double balance,Person customer){
        setAccnum(accnum);
        setBalance(balance);
        setCustomer(customer);
    }


    public String toString() {
        return "AccountNumber: "+accnum+"\nBalance: "+balance+"\nAccount Holder:"+customer;
    }


    public double lodgeMoney(){

       double amount = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the amount you want to lodge:"));

        this.balance += amount;

        return balance;
    }

    public double withdrawMoney(double amount){

        this.balance -= amount;
        return balance;

    }
}
