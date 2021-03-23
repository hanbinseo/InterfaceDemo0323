package android.studio.practice.interfaceprogram;

public class BankAccount implements Measurable{
    private double balance; // obj.getbalance()
    private int accountNumber; // obj.getAccountNumber()
    private static int lastAssignedNumber = 1000; // BankAccount.LastAssignedNumber

    public BankAccount(double balance){
        this.balance = balance;
        lastAssignedNumber++;
        accountNumber=lastAssignedNumber;
    }

    public double getMeasure() {
        return balance;
    }
}
