/*
 * Jonathan Limpus
 * Chapter 7 Part 2 Programming Project
 * BankAccount.java
 */
import java.text.NumberFormat;
public class BankAccount {
    //Private fields 
    private int accNumber;
    private String accType;
    private double accBalance;
    private double totalDeposit;
    private double totalWithdrawn;
    //Static variables 
    public static int numberAccounts;


    //Constructors 
    public BankAccount() {
        accNumber = 00000;
        accType = "";
        accBalance = 0.0;
    }


}