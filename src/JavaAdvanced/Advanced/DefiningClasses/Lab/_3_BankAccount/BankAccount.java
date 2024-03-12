package JavaAdvanced.Advanced.DefiningClasses.Lab._3_BankAccount;

public class BankAccount {
    private static int id;
    private double balance;
    private static double interestRate = 0.02;
    private static int accountsCount =1;

    public BankAccount() {
        this.id =id;
        id++;
    }

    public int getId(){
        return id;
    }

    public static void setInterestRate(double newInterestRate){
        BankAccount.interestRate=newInterestRate;
    }
    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    public void print() {
        System.out.printf("Account ID%d created%n", getId());
    }

}
