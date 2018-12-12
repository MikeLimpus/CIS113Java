public class BankAccountClient {   
    public static void main(String args[]) {
        BankAccount acc1 = new BankAccount(12345, "savings");
        BankAccount acc2 = new BankAccount(54321, "checking");
        BankAccount acc3 = new BankAccount(24680, "checking");

        acc1.print();
        acc2.print();
        acc3.print();

        System.out.println("Number of accounts: " + BankAccount.numberAccounts);

        for(int i = 0; i < 3; i++)
            acc1.depositFunds();
        acc1.print();
        for(int i = 0; i < 3; i++) 
            acc2.withdrawFunds();   // Don't overdraw
        acc2.print();
        for(int i = 0; i < 3; i++) 
            acc3.withdrawFunds();   // Overdraw
        acc3.print();
    }
}