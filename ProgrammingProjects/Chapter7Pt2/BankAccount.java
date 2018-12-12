/*
 * Jonathan Limpus
 * Chapter 7 Part 2 Programming Project
 * BankAccount.java
 */
import java.text.NumberFormat;
import java.util.Scanner;
public class BankAccount {
    //Private fields 
    private int accNumber;
    private String accType;
    private double accBalance;
    private double totalDeposit;
    private double totalWithdrawn;
    Scanner in = new Scanner(System.in);
    //Static variables 
    public static int numberAccounts;


    //Constructors 
    public BankAccount() {
        accNumber = 00000;
        accType = "";
        accBalance = 0.0;
        numberAccounts++;
    }

    public BankAccount(int accNumber, String accType) {
        this.accNumber = accNumber;
        if (accType == "checking" || accType == "savings")
            this.accType = accType;
        else 
            System.out.println("Invalid account type");
        accBalance = 200.00;
        numberAccounts++;
    }

    public void setAccNum(int accNumber) {
        this.accNumber = accNumber;
    }
    public void setType(String accType) {
        if(accType == "checking" || accType == "savings")
            this.accType = accType;
        else 
            System.out.println("Invalid Account Type");
    }
    public int getNum() {return accNumber;}
    public String getType() {return accType;}
    public double getBalance() {return accBalance;}
    public double getTotalDeposit() {return totalDeposit;}
    public double getTotalWithdrawn() {return totalWithdrawn;}
    public double getNumberAccounts() {return numberAccounts;}

    public void depositFunds() {
        double input;
        System.out.print("Please enter how much you want to deposit: ");
        input = in.nextDouble();
        System.out.println();
        totalDeposit += input;
        accBalance += input;
    }

    public void withdrawFunds() {
        double input; 
        System.out.print("Please enter how much you want to withdraw: ");
        input = in.nextDouble();
        totalWithdrawn += input;
        accBalance -= input;
        System.out.println();
        if (accBalance < 0.0) 
            System.out.println("You are overdrawn. Please correct within 30 days to prevent penalties");
    }

    public void print() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Type: " + accType);
        System.out.println("Account Balance: " + accBalance);
        System.out.println("Lifetime Deposits: " + totalDeposit);
        System.out.println("Lifetime Withdrawals: " +totalWithdrawn);
        
    }

}